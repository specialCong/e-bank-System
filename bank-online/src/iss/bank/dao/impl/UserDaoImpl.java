package iss.bank.dao.impl;

import iss.bank.dao.UserDAO;
import iss.bank.entity.User;

import java.util.List;
import java.util.Set;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;




/**
 * A data access object (DAO) providing persistence and search support for User
 * entities. Transaction control of the save(), update() and delete() operations
 * can directly support Spring container-managed transactions or they can be
 * augmented to handle user-managed Spring transactions. Each of these methods
 * provides additional information for how to configure it for the desired type
 * of transaction control.
 * 
 * @see iss.bank.entity.User
 * @author MyEclipse Persistence Tools
 */

public class UserDaoImpl extends HibernateDaoSupport implements UserDAO {
	private static final Log log = LogFactory.getLog(UserDaoImpl.class);
	/* (non-Javadoc)
	 * @see iss.bank.dao.impl.UserDAO#save(iss.bank.entity.User)
	 */
	public void save(User transientInstance) {
		log.debug("saving User instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see iss.bank.dao.impl.UserDAO#delete(iss.bank.entity.User)
	 */
	public void delete(User persistentInstance) {
		log.debug("deleting User instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see iss.bank.dao.impl.UserDAO#findById(java.lang.Integer)
	 */
	public User findById(java.lang.Integer id) {
		log.debug("getting User instance with id: " + id);
		try {
			User instance = (User) getSession().get("iss.bank.entity.User", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	
	/* (non-Javadoc)
	 * @see iss.bank.dao.impl.UserDAO#findByExample(iss.bank.entity.User)
	 */
	public List findByExample(User instance) {
		log.debug("finding User instance by example");
		try {
			List results = getSession().createCriteria("iss.bank.entity.User")
					.add(Example.create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see iss.bank.dao.impl.UserDAO#findByProperty(java.lang.String, java.lang.Object)
	 */
	public List findByProperty(String propertyName, Object value) {
		log.debug("finding User instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from User as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see iss.bank.dao.impl.UserDAO#findByUserLoginname(java.lang.Object)
	 */
	public List findByUserLoginname(Object userLoginname) {
		return findByProperty(USER_LOGINNAME, userLoginname);
	}

//	public List<User> findByUserLoginname(User user) {
//		String strHQL = "from User user where user.userPwd=?";
//		return getHibernateTemplate().find(strHQL, user.getUserPwd());
//	}
	
	public User findByUserLoginname(User user) {

		return (User) getHibernateTemplate().get(User.class,
				user.getUserId());
	}
	
	
	/* (non-Javadoc)
	 * @see iss.bank.dao.impl.UserDAO#findByUserPwd(java.lang.Object)
	 */
	public List findByUserPwd(Object userPwd) {
		return findByProperty(USER_PWD, userPwd);
	}

	/* (non-Javadoc)
	 * @see iss.bank.dao.impl.UserDAO#findByUsername(java.lang.Object)
	 */
	public List findByUsername(Object username) {
		return findByProperty(USERNAME, username);
	}

	/* (non-Javadoc)
	 * @see iss.bank.dao.impl.UserDAO#findByIdentityNum(java.lang.Object)
	 */
	public List findByIdentityNum(Object identityNum) {
		return findByProperty(IDENTITY_NUM, identityNum);
	}

	//依靠身份证号获取User
	public User findUserByIdentityNum(User user) {
		return (User) getHibernateTemplate().get(User.class,
				user.getUserId());
	}
	
	
	public void updateUser(User user) {
		this.getHibernateTemplate().update(user);
	}
	/* (non-Javadoc)
	 * @see iss.bank.dao.impl.UserDAO#findByGender(java.lang.Object)
	 */
	public List findByGender(Object gender) {
		return findByProperty(GENDER, gender);
	}

	/* (non-Javadoc)
	 * @see iss.bank.dao.impl.UserDAO#findByAddress(java.lang.Object)
	 */
	public List findByAddress(Object address) {
		return findByProperty(ADDRESS, address);
	}

	/* (non-Javadoc)
	 * @see iss.bank.dao.impl.UserDAO#findByTelephone(java.lang.Object)
	 */
	public List findByTelephone(Object telephone) {
		return findByProperty(TELEPHONE, telephone);
	}

	/* (non-Javadoc)
	 * @see iss.bank.dao.impl.UserDAO#findByBirthday(java.lang.Object)
	 */
	public List findByBirthday(Object birthday) {
		return findByProperty(BIRTHDAY, birthday);
	}

	/* (non-Javadoc)
	 * @see iss.bank.dao.impl.UserDAO#findAll()
	 */
	public List findAll() {
		log.debug("finding all User instances");
		try {
			String queryString = "from User";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see iss.bank.dao.impl.UserDAO#merge(iss.bank.entity.User)
	 */
	public User merge(User detachedInstance) {
		log.debug("merging User instance");
		try {
			User result = (User) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see iss.bank.dao.impl.UserDAO#attachDirty(iss.bank.entity.User)
	 */
	public void attachDirty(User instance) {
		log.debug("attaching dirty User instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see iss.bank.dao.impl.UserDAO#attachClean(iss.bank.entity.User)
	 */
	public void attachClean(User instance) {
		log.debug("attaching clean User instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}


}