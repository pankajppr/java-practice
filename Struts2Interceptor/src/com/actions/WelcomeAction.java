package com.actions;

import com.interceptor.UserAware;
import com.models.User;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class WelcomeAction extends ActionSupport implements UserAware, ModelDriven<User>{
	/**
	 * 
	 */
	private static final long serialVersionUID = 2844023031360731978L;
	private User user;
	
	public String execute(){
		System.out.println("execute() in WelcomeAction");
		return SUCCESS;
	}

	@Override
	public User getModel() {
		System.out.println("getModel in WelcomeAction");
		return user;
	}

	@Override
	public void setuser(User user) {
		System.out.println("setuset in WelcomeAction");
		this.user=user;
		
	}

}
