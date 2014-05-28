package iss.bank.action;

import iss.bank.entity.User;
import iss.bank.service.UserService;

import java.util.HashMap;
import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class ViewUserAction extends ActionSupport{
	User user;
	UserService userService;
	
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public UserService getUserService() {
		return userService;
	}
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	
	public ViewUserAction(){
		
	}
	
	public String excutes() throws Exception{
		
		
//		userService.updateUserAction;
		
		HashMap<String, Object> map=userService.viewUser(user);
		Map request = (Map) ActionContext.getContext().get("request");
		request.put("map", map);
		
		return SUCCESS;

	}

	
	
}
