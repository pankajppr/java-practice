package org.pankaj.service;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import org.pankaj.model.User;

public class LoginService {

		public boolean verifyLoging(User user){
			
			 DataSource dataSource;
			 Connection con =null;
			 PreparedStatement pst = null;
			 ResultSet rs = null;
			 
			 Context ctx;
			try {
				ctx = new InitialContext();
				dataSource = (DataSource)ctx.lookup("java:comp/env/jdbc/UsersDB");
				
				con = dataSource.getConnection();
				pst = con.prepareStatement("SELECT username FROM strutsuser WHERE username=? AND password=?");
				pst.setString(1, user.getUserId());
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
