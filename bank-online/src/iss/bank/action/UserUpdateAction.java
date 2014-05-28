package iss.bank.action;

import java.util.Map;
import org.hibernate.Session;
import iss.bank.entity.User;
import iss.bank.service.UserService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;


public class UserUpdateAction extends ActionSupport{
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
	
	public UserUpdateAction(){
		
	}
	public String execute() throws Exception {
		user = userService.updateUser(user);
		if(user!=null){
		Map session = ActionContext.getContext().getSession();
		session.put("user", user);
		
		return SUCCESS;
		}
		return INPUT;
}
}