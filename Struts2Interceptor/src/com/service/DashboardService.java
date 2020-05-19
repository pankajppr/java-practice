package com.service;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.*;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import com.models.UserListModel;

public class DashboardService {
	
	public boolean getUserListModel(UserListModel userListModel){
		
		DataSource dataSource;
		Connection con = null;
		PreparedStatement pst = null;
		ResultSet rs = null;		
		Context ctx;
		
			
		try{	
			//Get The InitialContext object
			ctx = new InitialContext();
			//Get the dataSource object
			dataSource = (DataSource)ctx.lookup("java:comp/env/jdbc/UsersDB");
			//Get Connection object
			con = dataSource.getConnection();
			pst = con.prepareStatement("SELECT * FROM strutsuser");			
			rs = pst.executeQuery();
			int hashCounter =1;
			while(rs.next()){
				List<String> list = new ArrayList<String>();
				String username = rs.getString(2);
				list.add(username);
				list.add(rs.getString(3));
				list.add(rs.getString(4));
				list.add(rs.getString(5));
				list.add(rs.getString(6));
				
				userListModel.getMap().put(hashCounter++, list);				
			}			
			return true;	
		}
		catch (NamingException e) {
		
			e.printStackTrace();
		}
		catch (Exception e) {
		
			e.printStackTrace();
		}
		finally{
		 con=null;
		}	
		return false;
		
	}

}
