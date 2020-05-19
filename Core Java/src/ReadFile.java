import java.io.*;
import java.util.*;

class WriterThread implements Runnable{
	String curDir = System.getProperty("user.dir");
	File f1 = new File("E:/Dev/eclipse_codes/practice/Core Java/src/file.txt");
	File f2 = new File("E:/Dev/eclipse_codes/practice/Core Java/src/file_copy.txt");
	
	public void run(){
		try{
			FileReader fr = new FileReader(f1);
			BufferedReader bfr = new BufferedReader(fr);
			FileWriter fw = new FileWriter(f2);
			BufferedWriter bfw = new BufferedWriter(fw);
			String line = null;
			while(null != (line = bfr.readLine())){
				synchronized(this){
					System.out.println(line);
					bfw.write(line +": "+Thread.currentThread().getName());		
					this.notify();
					this.wait();
				}		
			}
		}
		catch(Error e){
			e.printStackTrace();
		}
		catch(Exception e){
			e.printStackTrace();
		}		
		finally{
			System.out.println("Finally called");
		}
	}
}

public class ReadFile {
	public static void main(String args[]){
		WriterThread wt = new WriterThread();
		Thread t1 = new Thread(wt,"Thread 1");
		Thread t2 = new Thread(wt,"Thread 2");
		t1.start();t2.start();
		
//		try {
//			String curDir = System.getProperty("user.dir");
//			System.out.println("Current sys dir: " + curDir);
//			File f = new File("E:/Dev/eclipse_codes/practice/Core Java/src/file.txt");
//			//f.createNewFile();
//			FileReader fr = new FileReader(f);
//			FileWriter fw = new FileWriter("E:/Dev/eclipse_codes/practice/Core Java/src/file_copy.txt");
//			BufferedReader bfr = new BufferedReader(fr);
//			BufferedWriter bfw = new BufferedWriter(fw);
//			String line = null;
//			while((line=bfr.readLine())!= null){
//				System.out.println(line);
//				bfw.write(line+"\n");
//			}
//			bfr.close();
//			bfw.close();
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		}
//		catch(Exception e){
//			
//		}
//		finally{
//			//Release the file Lock
//		}
		
	}
}

