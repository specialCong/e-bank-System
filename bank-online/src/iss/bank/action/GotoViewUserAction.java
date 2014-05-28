package iss.bank.action;

import iss.bank.service.UserService;

import java.util.HashMap;
import java.util.Map;
import iss.bank.entity.User;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class GotoViewUserAction extends ActionSupport{
	UserService userService;

	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	
	
	public GotoViewUserAction() {
		// TODO Auto-generated constructor stub
	}

	public String execute() throws Exception {

		Map session = ActionContext.getContext().getSession();
		User user1 = (User) session.get("user");
		session.remove("user");
		HashMap<String, Object> map = userService.viewUser(user1);
		Map request = (Map) ActionContext.getContext().get("request");
		request.put("map", map);
		return SUCCESS;
	}
}
