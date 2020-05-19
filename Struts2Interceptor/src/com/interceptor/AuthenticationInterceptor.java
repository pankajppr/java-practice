package com.interceptor;
import java.util.Map;

import com.models.User;
import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

public class AuthenticationInterceptor implements Interceptor{


	private static final long serialVersionUID = 1309873028297240120L;

	@Override
	public void destroy() {
		// Release Resources here
		
	}

	@Override
	public void init() {
		// Create Resources Here
		
	}

	@Override
	public String intercept(ActionInvocation actionInvocation) throws Exception {
		System.out.println("Inside the Interceptor");
		
		Map<String,Object> sessionAttributes = actionInvocation.getInvocationContext().getSession();
		User user = (User)sessionAttributes.get("User");
		
		if(user == null){
			return Action.LOGIN;
		}
		else{
			Action action = (Action)actionInvocation.getAction();
			System.out.println("Class of next action in Action Invocation:"+action.getClass());
			if(action instanceof UserAware){
				((UserAware)action).setuser(user);
			}
			System.out.println("Value of actionInvocation.invoke():"+actionInvocation.invoke());
			return actionInvocation.invoke();
		}
	}

}
