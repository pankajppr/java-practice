package com.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import com.models.User;

public class LoginService {
	
	public boolean verifyUser(User user){
		
		DataSource dataSource;
		Connection con = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		
		Context ctx;
		try{	
				//Get The InitialContext object
				ctx = new InitialContext();
				//Get the dataSource object
				dataSource = (DataSource)ctx.lookup("java:comp/env/jdbc/VportDB");
				//Get Connection object
				con = dataSource.getConnection();
				pst = con.prepareStatement("SELECT * FROM user WHERE username=? AND password=?");
				pst.setString(1, user.getUser());
				pst.setString(2, user.getPassword());
				rs = pst.executeQuery();
				int flag=0;
				while(rs.next()){
					flag = 1;
				}
				
				if(flag ==1 ){
					return true;
				}
			
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
