package iss.bank.dao.impl;

import iss.bank.dao.UserinfoDAO;
import iss.bank.entity.Admin;
import iss.bank.entity.Userinfo;

import java.util.List;
import java.util.Set;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import  iss.bank.entity.*;

/**
 * A data access object (DAO) providing persistence and search support for
 * Userinfo entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see iss.bank.entity.Userinfo
 * @author MyEclipse Persistence Tools
 */

public class UserinfoDaoImpl extends HibernateDaoSupport implements UserinfoDAO {
	private static final Log log = LogFactory.getLog(UserinfoDaoImpl.class);
	/* (non-Javadoc)
	 * @see iss.bank.entity.UserinfoDAO#save(iss.bank.entity.Userinfo)
	 */
	public void save(Userinfo transientInstance) {
		log.debug("saving Userinfo instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see iss.bank.entity.UserinfoDAO#delete(iss.bank.entity.Userinfo)
	 */
	public void delete(Userinfo persistentInstance) {
		log.debug("deleting Userinfo instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see iss.bank.entity.UserinfoDAO#findById(java.lang.Integer)
	 */
	public Userinfo findById(java.lang.Integer id) {
		log.debug("getting Userinfo instance with id: " + id);
		try {
			Userinfo instance = (Userinfo) getSession().get(
					"iss.bank.entity.Userinfo", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public Userinfo getUserinfoByUser(User user){
		String sql="from userinfo as userInfo where userInfo.user='"+user+"'";
		List<Userinfo> list = this.getHibernateTemplate().find(sql);
		if(list!=null)
			return list.get(0);
		else 
			return null;
	}
	/* (non-Javadoc)
	 * @see iss.bank.entity.UserinfoDAO#findByExample(iss.bank.entity.Userinfo)
	 */
	public List findByExample(Userinfo instance) {
		log.debug("finding Userinfo instance by example");
		try {
			List results = getSession().createCriteria(
					"iss.bank.entity.Userinfo").add(Example.create(instance))
					.list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see iss.bank.entity.UserinfoDAO#findByProperty(java.lang.String, java.lang.Object)
	 */
	public List findByProperty(String propertyName, Object value) {
		log.debug("finding Userinfo instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Userinfo as model where model."
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
	 * @see iss.bank.entity.UserinfoDAO#findByUsername(java.lang.Object)
	 */
	public List findByUsername(Object username) {
		return findByProperty(USERNAME, username);
	}

	/* (non-Javadoc)
	 * @see iss.bank.entity.UserinfoDAO#findByIdentityNum(java.lang.Object)
	 */
	public List findByIdentityNum(Object identityNum) {
		return findByProperty(IDENTITY_NUM, identityNum);
	}

	/* (non-Javadoc)
	 * @see iss.bank.entity.UserinfoDAO#findByGender(java.lang.Object)
	 */
	public List findByGender(Object gender) {
		return findByProperty(GENDER, gender);
	}

	/* (non-Javadoc)
	 * @see iss.bank.entity.UserinfoDAO#findByAddress(java.lang.Object)
	 */
	public List findByAddress(Object address) {
		return findByProperty(ADDRESS, address);
	}

	/* (non-Javadoc)
	 * @see iss.bank.entity.UserinfoDAO#findByTelephone(java.lang.Object)
	 */
	public List findByTelephone(Object telephone) {
		return findByProperty(TELEPHONE, telephone);
	}

	/* (non-Javadoc)
	 * @see iss.bank.entity.UserinfoDAO#findByBirthday(java.lang.Object)
	 */
	public List findByBirthday(Object birthday) {
		return findByProperty(BIRTHDAY, birthday);
	}

	/* (non-Javadoc)
	 * @see iss.bank.entity.UserinfoDAO#findAll()
	 */
	public List findAll() {
		log.debug("finding all Userinfo instances");
		try {
			String queryString = "from Userinfo";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see iss.bank.entity.UserinfoDAO#merge(iss.bank.entity.Userinfo)
	 */
	public Userinfo merge(Userinfo detachedInstance) {
		log.debug("merging Userinfo instance");
		try {
			Userinfo result = (Userinfo) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see iss.bank.entity.UserinfoDAO#attachDirty(iss.bank.entity.Userinfo)
	 */
	public void attachDirty(Userinfo instance) {
		log.debug("attaching dirty Userinfo instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see iss.bank.entity.UserinfoDAO#attachClean(iss.bank.entity.Userinfo)
	 */
	public void attachClean(Userinfo instance) {
		log.debug("attaching clean Userinfo instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}