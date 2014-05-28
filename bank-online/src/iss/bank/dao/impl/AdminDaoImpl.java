package iss.bank.dao.impl;

import iss.bank.dao.AdminDAO;
import iss.bank.entity.Admin;
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
 * A data access object (DAO) providing persistence and search support for Admin
 * entities. Transaction control of the save(), update() and delete() operations
 * can directly support Spring container-managed transactions or they can be
 * augmented to handle user-managed Spring transactions. Each of these methods
 * provides additional information for how to configure it for the desired type
 * of transaction control.
 * 
 * @see iss.bank.entity.Admin
 * @author MyEclipse Persistence Tools
 */

public class AdminDaoImpl extends HibernateDaoSupport implements AdminDAO {
	private static final Log log = LogFactory.getLog(AdminDaoImpl.class);
	/* (non-Javadoc)
	 * @see iss.bank.dao.impl.AdminDAO#save(iss.bank.entity.Admin)
	 */
	public void save(Admin transientInstance) {
		log.debug("saving Admin instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see iss.bank.dao.impl.AdminDAO#delete(iss.bank.entity.Admin)
	 */
	public void delete(Admin persistentInstance) {
		log.debug("deleting Admin instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see iss.bank.dao.impl.AdminDAO#findById(java.lang.Integer)
	 */
	public Admin findById(java.lang.Integer id) {
		log.debug("getting Admin instance with id: " + id);
		try {
			Admin instance = (Admin) getSession().get("iss.bank.entity.Admin",
					id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see iss.bank.dao.impl.AdminDAO#findByExample(iss.bank.entity.Admin)
	 */
	public List findByExample(Admin instance) {
		log.debug("finding Admin instance by example");
		try {
			List results = getSession().createCriteria("iss.bank.entity.Admin")
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
	 * @see iss.bank.dao.impl.AdminDAO#findByProperty(java.lang.String, java.lang.Object)
	 */
	public List findByProperty(String propertyName, Object value) {
		log.debug("finding Admin instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Admin as model where model."
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
	 * @see iss.bank.dao.impl.AdminDAO#findByAdminName(java.lang.Object)
	 */
	public List findByAdminName(Object adminName) {
		return findByProperty(ADMIN_NAME, adminName);
	}

	/* (non-Javadoc)
	 * @see iss.bank.dao.impl.AdminDAO#findByAdminPwd(java.lang.Object)
	 */
	public List findByAdminPwd(Object adminPwd) {
		return findByProperty(ADMIN_PWD, adminPwd);
	}
	/* (non-Javadoc)
	 * @see iss.bank.dao.impl.AdminDAO#findByNamePwd(java.lang.String, java.lang.String)
	 */
	public User findByNamePwd(String name, String pwd) {
		User instance = null;
		try {
			String queryString = "from User as model where loginname=:nn and pwd=:pp";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setString("nn", name);
			queryObject.setString("pp", pwd);
			instance = (User) queryObject.uniqueResult();
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
	/* (non-Javadoc)
	 * @see iss.bank.dao.impl.AdminDAO#findAll()
	 */
	public List findAll() {
		log.debug("finding all Admin instances");
		try {
			String queryString = "from Admin";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see iss.bank.dao.impl.AdminDAO#merge(iss.bank.entity.Admin)
	 */
	public Admin merge(Admin detachedInstance) {
		log.debug("merging Admin instance");
		try {
			Admin result = (Admin) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see iss.bank.dao.impl.AdminDAO#attachDirty(iss.bank.entity.Admin)
	 */
	public void attachDirty(Admin instance) {
		log.debug("attaching dirty Admin instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see iss.bank.dao.impl.AdminDAO#attachClean(iss.bank.entity.Admin)
	 */
	public void attachClean(Admin instance) {
		log.debug("attaching clean Admin instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}