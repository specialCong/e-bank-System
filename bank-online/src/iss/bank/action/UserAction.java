package iss.bank.action;   

import iss.bank.entity.User;
import iss.bank.service.UserService;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.apache.struts2.ServletActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class UserAction extends ActionSupport{   

    private User user;

    private UserService userService;   



 /*   public String execute() throws Exception{
    	try
    	{
    		UserService userService = serviceManager.getUserService();
    		if(userService.verifyUser(user))
    		{
    			saveCookie("user",user.getUser(),24*60*60);
    			HttpSession session = request.getSession();
    			session.setAttribute("username", user.getUser());
    			session.setMaxInactiveInterval(60*60*3);
    			return SUCCESS;
    		}
    	}
    	catch (Exception e)
    	{
    	}
    	return ERROR;
    }*/

    public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	public String login(){
           String page = "input";
           User flag = userService.checkUser(user.getUserLoginname(), user.getUserPwd());

           //获得request对象
			HttpServletRequest  request=ServletActionContext.getRequest();
			//获得session对象
			HttpSession session=request.getSession();
           if(flag != null){
            page = "SUCCESS";
            session.setAttribute("user", flag);

           }
           return page;
    }
    
    public String register(){
    	userService.register(user);
    	return "SUCCESS";
    }
    
//    public String update(){
//    	userServiceImpl.update(user);
//    	return "SUCCESS";
//    }
    
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}

}  