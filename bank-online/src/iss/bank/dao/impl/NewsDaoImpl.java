package iss.bank.dao.impl;

import iss.bank.dao.NewsDAO;
import iss.bank.entity.News;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
/**
 * A data access object (DAO) providing persistence and search support for News
 * entities. Transaction control of the save(), update() and delete() operations
 * can directly support Spring container-managed transactions or they can be
 * augmented to handle user-managed Spring transactions. Each of these methods
 * provides additional information for how to configure it for the desired type
 * of transaction control.
 * 
 * @see iss.bank.entity.News
 * @author MyEclipse Persistence Tools
 */

public class NewsDaoImpl extends HibernateDaoSupport implements NewsDAO {
	private static final Log log = LogFactory.getLog(NewsDaoImpl.class);
	/* (non-Javadoc)
	 * @see iss.bank.dao.impl.NewsDAO#save(iss.bank.entity.News)
	 */
	public void save(News transientInstance) {
		log.debug("saving News instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see iss.bank.dao.impl.NewsDAO#delete(iss.bank.entity.News)
	 */
	public void delete(News persistentInstance) {
		log.debug("deleting News instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see iss.bank.dao.impl.NewsDAO#findById(java.lang.Integer)
	 */
	public News findById(java.lang.Integer id) {
		log.debug("getting News instance with id: " + id);
		try {
			News instance = (News) getSession().get("iss.bank.entity.News", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see iss.bank.dao.impl.NewsDAO#findByExample(iss.bank.entity.News)
	 */
	public List findByExample(News instance) {
		log.debug("finding News instance by example");
		try {
			List results = getSession().createCriteria("iss.bank.entity.News")
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
	 * @see iss.bank.dao.impl.NewsDAO#findByProperty(java.lang.String, java.lang.Object)
	 */
	public List findByProperty(String propertyName, Object value) {
		log.debug("finding News instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from News as model where model."
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
	 * @see iss.bank.dao.impl.NewsDAO#findByNewsTitle(java.lang.Object)
	 */
	public List findByNewsTitle(Object newsTitle) {
		return findByProperty(NEWS_TITLE, newsTitle);
	}

	/* (non-Javadoc)
	 * @see iss.bank.dao.impl.NewsDAO#findByNewsDate(java.lang.Object)
	 */
	public List findByNewsDate(Object newsDate) {
		return findByProperty(NEWS_DATE, newsDate);
	}

	/* (non-Javadoc)
	 * @see iss.bank.dao.impl.NewsDAO#findByNewsContent(java.lang.Object)
	 */
	public List findByNewsContent(Object newsContent) {
		return findByProperty(NEWS_CONTENT, newsContent);
	}

	/* (non-Javadoc)
	 * @see iss.bank.dao.impl.NewsDAO#findAll()
	 */
	public List findAll() {
		log.debug("finding all News instances");
		try {
			String queryString = "from News";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see iss.bank.dao.impl.NewsDAO#merge(iss.bank.entity.News)
	 */
	public News merge(News detachedInstance) {
		log.debug("merging News instance");
		try {
			News result = (News) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see iss.bank.dao.impl.NewsDAO#attachDirty(iss.bank.entity.News)
	 */
	public void attachDirty(News instance) {
		log.debug("attaching dirty News instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see iss.bank.dao.impl.NewsDAO#attachClean(iss.bank.entity.News)
	 */
	public void attachClean(News instance) {
		log.debug("attaching clean News instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}