package iss.bank.action;

import java.util.Map;
import iss.bank.entity.User;
import iss.bank.service.UserService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class UserLoginAction extends ActionSupport {
	UserService userService;
	User user;



	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public UserLoginAction() {
		// TODO Auto-generated constructor stub
	}

//	public String execute() throws Exception {
//		if (user == null) {
//			System.err.println("~~~user用户不存在~~~");
//		} else {
//			user = userService.login(user);
//			if (user != null) {
//				Map session = ActionContext.getContext().getSession();
//				session.put("user", user);
//
//				return SUCCESS;
//			}
//
//			// addFieldError("", "用戶名和身份证号不匹配");
//
//		}
//		return INPUT;
//
//	}
	

}
