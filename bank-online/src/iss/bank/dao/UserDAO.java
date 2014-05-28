package iss.bank.dao;

import iss.bank.entity.User;

import java.util.List;




public interface UserDAO {

	// property constants
	public static final String USER_LOGINNAME = "userLoginname";
	public static final String USER_PWD = "userPwd";
	public static final String USERNAME = "username";
	public static final String IDENTITY_NUM = "identityNum";
	public static final String GENDER = "gender";
	public static final String ADDRESS = "address";
	public static final String TELEPHONE = "telephone";
	public static final String BIRTHDAY = "birthday";

	public abstract void save(User transientInstance);

	public abstract void delete(User persistentInstance);

	public abstract User findById(java.lang.Integer id);

	public abstract List findByExample(User instance);

	public abstract List findByProperty(String propertyName, Object value);

	public User findByUserLoginname(User user);

	public abstract List findByUserPwd(Object userPwd);

	public abstract List findByUsername(Object username);

	public User findUserByIdentityNum(User user);
	
	public void updateUser(User user);
	
	public abstract List findByIdentityNum(Object identityNum);

	public abstract List findByGender(Object gender);

	public abstract List findByAddress(Object address);

	public abstract List findByTelephone(Object telephone);

	public abstract List findByBirthday(Object birthday);

	public abstract List findAll();

	public abstract User merge(User detachedInstance);

	public abstract void attachDirty(User instance);

	public abstract void attachClean(User instance);

}