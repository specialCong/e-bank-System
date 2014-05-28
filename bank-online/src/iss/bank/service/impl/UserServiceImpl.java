package iss.bank.service.impl;   

import iss.bank.dao.UserDAO;
import iss.bank.entity.User;
import iss.bank.service.UserService;

import java.util.HashMap;
import java.util.List;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;



  public class UserServiceImpl extends HibernateDaoSupport implements UserService  {
	  private UserDAO userDAO;
	  
	  
    public UserDAO getUserDAO() {
		return userDAO;
	}

	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}

	
	
	//普通用户登录验证   
    /* (non-Javadoc)
	 * @see iss.bank.service.impl.UserService#checkUser(java.lang.String, java.lang.String)
	 */
    /* (non-Javadoc)
	 * @see iss.bank.service.impl.UserService#checkUser(java.lang.String, java.lang.String)
	 */
    @SuppressWarnings("unchecked")
    public User checkUser(String userLoginname,String userPwd){
       User flag = null;
      String hql = "from User as user where user.userLoginname = '"              +userLoginname+"' and user.userPwd = '"+userPwd+"'";
      List<User> userList = this.getHibernateTemplate().find(hql);
       if(userList.size()>0){
        flag = userList.get(0);
       }
       return flag;
    }
    
//    public HashMap<String, Object> viewUser(User user) {
//
//		user = userDAO.findByUserLoginname(user);
//
//		if (user != null) {
//			HashMap<String, Object> map = new HashMap<String, Object>();
//			map.put("user", user);
//			return map;
//
//		}
//		return null;
//	}
    
	public User updateUser(User user) {
		// 更新用户信息

		if (user != null) {
			User findUser = userDAO.findUserByIdentityNum(user);
			
			findUser.setUsername(user.getUsername());
			findUser.setAddress(user.getAddress());
			findUser.setBirthday(user.getBirthday());
			findUser.setTelephone(user.getTelephone());
			findUser.setGender(user.getGender());
			findUser.setUserPwd(user.getUserPwd());
			
			this.userDAO.updateUser(findUser);

			return findUser;
		} else
			return null;

	}

//	public User login(User user) {
//		if (userDAO.findByUserLoginname(user)!= null) {
//			User findUser = userDAO.findByUserLoginname(
//					user).get(0);
//			if (findUser.getUserPwd().equals(user.getUserPwd())) {
//				return findUser;
//			} else
//				return null;
//		}
//		return null;
//	}
 
	
    public boolean register(User user){
    	userDAO.save(user);
    	return true;
    }

   

	public HashMap<String, Object> viewUser(User user) {
		// TODO Auto-generated method stub

		user = userDAO.findByUserLoginname(user);

		if (user != null) {
			HashMap<String, Object> map = new HashMap<String, Object>();
			map.put("user", user);
			return map;
		}
		return null;
	}


}


