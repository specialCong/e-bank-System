package iss.bank.service;

import java.util.HashMap;

import iss.bank.entity.User;


public interface UserService {

	//普通用户登录验证   
	/* (non-Javadoc)
	 * @see iss.bank.service.impl.UserService#checkUser(java.lang.String, java.lang.String)
	 */
	@SuppressWarnings("unchecked")
	public abstract User checkUser(String userLoginname, String userPwd);
	
	boolean register(User user);

	 public HashMap<String,Object> viewUser(User user);
	
	public User updateUser(User user);

//	public  User login(User user);
}