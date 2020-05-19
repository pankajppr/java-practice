package com.filemon.restapi;

import com.filemon.model.DirectoryPath;
import com.filemon.model.FileDetails;
import com.filemon.util.SessionFactoryGet;

import javassist.bytecode.Descriptor.Iterator;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

@Path("/monitoringApp")
public class TriggerFileMonitoring {
	@POST
	@Path("/runPath")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response getPath(DirectoryPath path, @Context UriInfo uriInfo){
		String directory = path.getPath();
		List<FileDetails> list = triggerMonitoring();
		URI returnUri = uriInfo.getAbsolutePathBuilder().path("show").build();
		return Response.created(returnUri)
						.entity(list.toArray(new FileDetails[list.size()]))
						.build();
	}
	
	@GET
	@Path("/trigger")
	@Produces(MediaType.APPLICATION_JSON)
	public List<FileDetails> triggerMonitoring(){
		//Get the path of directory to be monitored
		String directory1= "E:/Dev/MonDirectory";
		List<String> directories = new ArrayList();
		directories.add(directory1);
		
		//Get the fileMap for the paths and update database with filedetails
		 Map<String, List<FileDetails>> filesDetailMap = getFilesIndirectory(directories);
		 List<FileDetails> listToSend = new ArrayList();
			Session session = SessionFactoryGet.getSessionFactory().openSession();
			session.beginTransaction();
			for(Map.Entry<String, List<FileDetails>> fileDetails : filesDetailMap.entrySet()){
				for(FileDetails fileDetail : fileDetails.getValue()){
					session.save(fileDetail);
				}
			}		
			session.getTransaction().commit();
		//upload the files to different location get the update status
		//we can use JSCH SFTP API to upload the data to remote server by opening a channel in sftp mode and channelSftp.put(new FileInputStream(f), f.getName());
		//Here I will move the file from one directory to another directory and update the result 
			archiveFiles(filesDetailMap);
		// send the file details in response to the trigger call		 
		//System.out.println(filesDetailMap);
			for(Map.Entry<String, List<FileDetails>> fileDetails : filesDetailMap.entrySet()){
				for(FileDetails fileDetail : fileDetails.getValue()){
					listToSend.add(fileDetail);
				}
			}
		return listToSend;
	}

	private void archiveFiles(Map<String, List<FileDetails>> filesDetailMap) {
		File archiveDirectory = new File("E:\\Dev\\MonDirectory\\Archive".replace('\\', '/'));
		for(Map.Entry<String, List<FileDetails>> fileDetails : filesDetailMap.entrySet()){
			for(FileDetails fileDetail : fileDetails.getValue()){
				InputStream inputStream = null;
				OutputStream outputStream = null;
				
					try {
						File fileIn = new File(fileDetail.getFromPath());
						File fileOut = new File(archiveDirectory.getAbsolutePath()+"/"+fileDetail.getFileName());
						
						inputStream = new FileInputStream(fileIn);
						outputStream = new FileOutputStream(fileOut);
						int length;
						byte[] buffer = new byte[1024];
						while((length = inputStream.read(buffer))>0){
							outputStream.write(buffer,0,length);
						}
						
						
							fileDetail.setStatus((short) 2);
							fileDetail.setToPath(archiveDirectory.getAbsolutePath());
							//System.out.println("File Moved: "+ fileDetail.getFileName());
							//Update status in database
							Session session = SessionFactoryGet.getSessionFactory().openSession();
							session.beginTransaction();
							session.update(fileDetail);
							//Query hqlUpdateQuery = session.createQuery("Update FileDetails set toPath=:toPath, status=:status");
							session.getTransaction().commit();
							session.close();
							
							//delete the original file
							//fileIn.delete();
							
				
					} catch (Exception e) {
						fileDetail.setStatus((short) 3);
						System.out.println("File Failed to Moved: "+ fileDetail.getFileName());
						e.printStackTrace();
					}
					finally{
						try {
							inputStream.close();
							outputStream.close();
						} catch (IOException e) {
							e.printStackTrace();
						}
						
					}
			}
		}		
	}

	public Map<String, List<FileDetails>> getFilesIndirectory(List<String> directories) {
		Map<String, List<FileDetails>> filesDetailMap = new HashMap<String, List<FileDetails>>();
		for(String directoryPath : directories){
			String javaPath = directoryPath.replace("\\", "/");
			List<FileDetails> resultList = new ArrayList<FileDetails>();
			File directory = new File(javaPath);
			if(!directory.exists()) return null;
			File[] filesArray = directory.listFiles();
			for(File file: filesArray){
			 if(!file.isDirectory()){
				FileDetails newFileDetail = new FileDetails();
				newFileDetail.setFileName(file.getName());
				newFileDetail.setFromPath(file.getAbsolutePath());
				newFileDetail.setStatus((short) 1);
				newFileDetail.setTimeStatusChanged(new Date());
				resultList.add(newFileDetail);
			 }
			}
			filesDetailMap.put(directoryPath, resultList);
		}
		return filesDetailMap;
	}
}
