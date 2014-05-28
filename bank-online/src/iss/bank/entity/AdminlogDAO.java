package iss.bank.entity;

import iss.bank.dao.impl.BaseHibernateDAO;
import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;

/**
 * A data access object (DAO) providing persistence and search support for
 * Adminlog entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see iss.bank.entity.Adminlog
 * @author MyEclipse Persistence Tools
 */

public class AdminlogDAO extends BaseHibernateDAO {
	private static final Log log = LogFactory.getLog(AdminlogDAO.class);
	// property constants
	public static final String LOG_CONTENT = "logContent";

	public void save(Adminlog transientInstance) {
		log.debug("saving Adminlog instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Adminlog persistentInstance) {
		log.debug("deleting Adminlog instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Adminlog findById(java.lang.Integer id) {
		log.debug("getting Adminlog instance with id: " + id);
		try {
			Adminlog instance = (Adminlog) getSession().get(
					"iss.bank.entity.Adminlog", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Adminlog instance) {
		log.debug("finding Adminlog instance by example");
		try {
			List results = getSession().createCriteria(
					"iss.bank.entity.Adminlog").add(Example.create(instance))
					.list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding Adminlog instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Adminlog as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByLogContent(Object logContent) {
		return findByProperty(LOG_CONTENT, logContent);
	}

	public List findAll() {
		log.debug("finding all Adminlog instances");
		try {
			String queryString = "from Adminlog";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Adminlog merge(Adminlog detachedInstance) {
		log.debug("merging Adminlog instance");
		try {
			Adminlog result = (Adminlog) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Adminlog instance) {
		log.debug("attaching dirty Adminlog instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Adminlog instance) {
		log.debug("attaching clean Adminlog instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}