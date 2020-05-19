package org.pankaj.action;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.apache.struts2.interceptor.SessionAware;
import org.pankaj.model.User;
import org.pankaj.service.LoginService;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class LoginAction extends ActionSupport implements ModelDriven<User>, SessionAware {
	
	public User user = new User();
	Map<String, Object> m;
	
	public void validate(){
		if(StringUtils.isEmpty(user.getUserId())){
			 //addFieldError("userId", "UserId Cannot be Blank");
			 addActionError("UserId Cannot be Blank");
		}
		if(StringUtils.isEmpty(user.getPassword())){
			//addFieldError("password", "Password cannot be left blank");
			addActionError("Password cannot be left blank");
		}
	}
	
	public String execute(){
		LoginService loginService = new LoginService();
		if(loginService.verifyLoging(user)){
			m.put("user", user.getUserId());
			return SUCCESS;
		}
		addActionError("Username or Password Entered is Wrong. Please try again.");
		return LOGIN;
	}

	@Override
	public User getModel() {
		return user;
	}

	@Override
	public void setSession(Map<String, Object> m) {
		this.m=m;
		
	}

}
