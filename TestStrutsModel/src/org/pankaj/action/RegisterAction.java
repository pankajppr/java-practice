package org.pankaj.action;

import org.pankaj.model.UserRegisterModel;
import org.pankaj.service.RegisterService;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class RegisterAction extends ActionSupport implements ModelDriven<UserRegisterModel>{
	
	public UserRegisterModel userRegisterModel = new UserRegisterModel();
	
	public String execute(){
		RegisterService registerService = new RegisterService();
		boolean result = registerService.registerUser(userRegisterModel);

		if(result){  
		    return SUCCESS;  
		    }  
		    return ERROR;  
		  }  

	@Override
	public UserRegisterModel getModel() {
		return userRegisterModel;
	}

}
