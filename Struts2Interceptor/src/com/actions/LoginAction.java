package com.actions;

import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.apache.struts2.interceptor.SessionAware;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.service.LoginService;
import com.models.User;

public class LoginAction extends ActionSupport implements SessionAware, ModelDriven<User>{
	/**
	 * 
	 */
	private static final long serialVersionUID = -3589969172114218233L;
	private User user =new User();
	private Map<String, Object> sessionAttributes = null;
	
	@Override
	public void validate(){
		if(StringUtils.isEmpty(user.getUser())){
			 //addFieldError("userId", "UserId Cannot be Blank");
			 addActionError("UserId Cannot be Blank");
		}
		if(StringUtils.isEmpty(user.getPassword())){
			//addFieldError("password", "Password cannot be left blank");
			addActionError("Password cannot be left blank");
		}
	}
	
	@Override
	public String execute(){
		System.out.println("Inside LoginAction execute()");
		LoginService loginService = new LoginService();
		
		if(loginService.verifyUser(user)){
			user.setUsername(user.getUser());
			sessionAttributes.put("User", user);
			return SUCCESS;
			
		}
		addActionError("Username or Password Entered is Wrong. Please try again.");
		return INPUT;
	}
	
	@Override
	public void setSession(Map<String, Object> sessionAttributes) {
		this.sessionAttributes = sessionAttributes;
		
	}

	@Override
	public User getModel() {
		return user;
	}

}
