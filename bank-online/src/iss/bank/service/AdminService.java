package iss.bank.service;

import java.util.List;

public interface AdminService {

	//管理员登录验证   
	/* (non-Javadoc)
	 * @see iss.bank.service.impl.UserService#checkUser(java.lang.String, java.lang.String)
	 */
	/* (non-Javadoc)
	 * @see iss.bank.service.impl.UserService#checkUser(java.lang.String, java.lang.String)
	 */
	/* (non-Javadoc)
	 * @see iss.bank.service.impl.AdminService#checkUser(java.lang.String, java.lang.String)
	 */
	/* (non-Javadoc)
	 * @see iss.bank.service.impl.AdminService#checkAdmin(java.lang.String, java.lang.String)
	 */
	@SuppressWarnings("unchecked")
	public abstract boolean checkAdmin(String adminName, String adminPwd);

	public abstract boolean delete(int userId);

	public abstract List findAll(int pageNow, int pageSize);

}