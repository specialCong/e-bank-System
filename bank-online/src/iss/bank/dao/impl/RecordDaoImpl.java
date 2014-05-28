package iss.bank.dao.impl;

import iss.bank.dao.RecordDAO;
import iss.bank.entity.Record;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
/**
 * A data access object (DAO) providing persistence and search support for
 * Record entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see iss.bank.entity.Record
 * @author MyEclipse Persistence Tools
 */

public class RecordDaoImpl extends HibernateDaoSupport implements RecordDAO {
	private static final Log log = LogFactory.getLog(RecordDaoImpl.class);
	/* (non-Javadoc)
	 * @see iss.bank.dao.impl.RecordDAO#save(iss.bank.entity.Record)
	 */
	public void save(Record transientInstance) {
		log.debug("saving Record instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see iss.bank.dao.impl.RecordDAO#delete(iss.bank.entity.Record)
	 */
	public void delete(Record persistentInstance) {
		log.debug("deleting Record instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see iss.bank.dao.impl.RecordDAO#findById(java.lang.Integer)
	 */
	public Record findById(java.lang.Integer id) {
		log.debug("getting Record instance with id: " + id);
		try {
			Record instance = (Record) getSession().get(
					"iss.bank.entity.Record", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see iss.bank.dao.impl.RecordDAO#findByExample(iss.bank.entity.Record)
	 */
	public List findByExample(Record instance) {
		log.debug("finding Record instance by example");
		try {
			List results = getSession()
					.createCriteria("iss.bank.entity.Record").add(
							Example.create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see iss.bank.dao.impl.RecordDAO#findByProperty(java.lang.String, java.lang.Object)
	 */
	public List findByProperty(String propertyName, Object value) {
		log.debug("finding Record instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Record as model where model."
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
	 * @see iss.bank.dao.impl.RecordDAO#findByRecordAmount(java.lang.Object)
	 */
	public List findByRecordAmount(Object recordAmount) {
		return findByProperty(RECORD_AMOUNT, recordAmount);
	}

	/* (non-Javadoc)
	 * @see iss.bank.dao.impl.RecordDAO#findByRecordState(java.lang.Object)
	 */
	public List findByRecordState(Object recordState) {
		return findByProperty(RECORD_STATE, recordState);
	}

	/* (non-Javadoc)
	 * @see iss.bank.dao.impl.RecordDAO#findByRecordDate(java.lang.Object)
	 */
	public List findByRecordDate(Object recordDate) {
		return findByProperty(RECORD_DATE, recordDate);
	}

	/* (non-Javadoc)
	 * @see iss.bank.dao.impl.RecordDAO#findAll()
	 */
	public List findAll() {
		log.debug("finding all Record instances");
		try {
			String queryString = "from Record";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see iss.bank.dao.impl.RecordDAO#merge(iss.bank.entity.Record)
	 */
	public Record merge(Record detachedInstance) {
		log.debug("merging Record instance");
		try {
			Record result = (Record) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see iss.bank.dao.impl.RecordDAO#attachDirty(iss.bank.entity.Record)
	 */
	public void attachDirty(Record instance) {
		log.debug("attaching dirty Record instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see iss.bank.dao.impl.RecordDAO#attachClean(iss.bank.entity.Record)
	 */
	public void attachClean(Record instance) {
		log.debug("attaching clean Record instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}