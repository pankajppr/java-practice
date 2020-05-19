package com.actions;

import java.util.*;

import com.models.UserListModel;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.util.ValueStack;
import com.service.DashboardService;


public class DashboardAction extends ActionSupport implements  ModelDriven<UserListModel>{
	private static final long serialVersionUID = 946411489765043142L;
	
	
	public UserListModel userListModel = new  UserListModel();	
	
	public String execute(){
		System.out.println("execute() in DashboardAction");
		DashboardService dashboardService = new DashboardService();
		boolean result = dashboardService.getUserListModel(userListModel);
		
		//Cross verifying the valueStack 
		ValueStack stack = ActionContext.getContext().getValueStack();
		@SuppressWarnings("unchecked")
		Map<Integer, List<String>> map1 = (Map<Integer, List<String>>) stack.findValue("map");
		System.out.println("ValueStack Map object:"+map1);
		if(result){  
		    return SUCCESS;  
		    }  
		    return ERROR;    
	}

	@Override
	public UserListModel getModel() {
		return userListModel;
	}

}
