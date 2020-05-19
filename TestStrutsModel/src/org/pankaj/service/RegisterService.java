package org.pankaj.service;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;
import javax.naming.Context;
import javax.naming.InitialContext;

import org.pankaj.model.UserRegisterModel;


public class RegisterService {
	
	 private DataSource dataSource;
	    
	 Connection con =null;
	 PreparedStatement pst = null;
	 ResultSet rs = null;
	 
	public boolean registerUser(UserRegisterModel userRegisterModel) {
		int response = 0;
		
		try {
			Context ctx = new InitialContext();
			dataSource = (DataSource)ctx.lookup("java:comp/env/jdbc/UsersDB");
			
			con = dataSource.getConnection();
			pst = con.prepareStatement("INSERT INTO strutsuser (username,password,email,gender,country) VALUES(?,?,?,?,?);");
			pst.setString(1, userRegisterModel.getUserId());
			pst.setString(2,userRegisterModel.getPassword());
			pst.setString(3,userRegisterModel.getEmail());
			pst.setString(4,userRegisterModel.getGender());
			pst.setString(5,userRegisterModel.getCountry());
			
			response = pst.executeUpdate();
		    System.out.println("Your data has been accepted" + response);
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		catch (Exception e) {
			
			e.printStackTrace();
		}
		
		if(response==1){
			return true;
		}
		
		
		return false;
	}

		
}
