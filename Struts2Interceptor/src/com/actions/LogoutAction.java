package com.actions;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.models.User;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class LogoutAction extends ActionSupport implements SessionAware{

	private static final long serialVersionUID = 1L;
	private Map<String, Object> sessionAttributes = ActionContext.getContext().getSession();
	private User user = (User) sessionAttributes.get("User");
	
	public String execute(){
		System.out.println("Inside LogoutAction execute()");
		if(user!=null){
			sessionAttributes.remove("User");
			addActionError("Successfully Logged Out.");
			return INPUT;
		}
		addActionError("No Logged In User");
		return INPUT;
	}

	@Override
	public void setSession(Map<String, Object> arg0) {
		
	}
	

}
