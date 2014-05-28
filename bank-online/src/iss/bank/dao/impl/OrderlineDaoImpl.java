package iss.bank.dao.impl;

import iss.bank.dao.OrderlineDAO;
import iss.bank.entity.Orderline;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
/**
 * A data access object (DAO) providing persistence and search support for
 * Orderline entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see iss.bank.entity.Orderline
 * @author MyEclipse Persistence Tools
 */

public class OrderlineDaoImpl extends HibernateDaoSupport implements OrderlineDAO {
	private static final Log log = LogFactory.getLog(OrderlineDaoImpl.class);
	/* (non-Javadoc)
	 * @see iss.bank.dao.impl.OrderlineDAO#save(iss.bank.entity.Orderline)
	 */
	public void save(Orderline transientInstance) {
		log.debug("saving Orderline instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see iss.bank.dao.impl.OrderlineDAO#delete(iss.bank.entity.Orderline)
	 */
	public void delete(Orderline persistentInstance) {
		log.debug("deleting Orderline instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see iss.bank.dao.impl.OrderlineDAO#findById(java.lang.Integer)
	 */
	public Orderline findById(java.lang.Integer id) {
		log.debug("getting Orderline instance with id: " + id);
		try {
			Orderline instance = (Orderline) getSession().get(
					"iss.bank.entity.Orderline", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see iss.bank.dao.impl.OrderlineDAO#findByExample(iss.bank.entity.Orderline)
	 */
	public List findByExample(Orderline instance) {
		log.debug("finding Orderline instance by example");
		try {
			List results = getSession().createCriteria(
					"iss.bank.entity.Orderline").add(Example.create(instance))
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
	 * @see iss.bank.dao.impl.OrderlineDAO#findByProperty(java.lang.String, java.lang.Object)
	 */
	public List findByProperty(String propertyName, Object value) {
		log.debug("finding Orderline instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Orderline as model where model."
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
	 * @see iss.bank.dao.impl.OrderlineDAO#findByOrderStatus(java.lang.Object)
	 */
	public List findByOrderStatus(Object orderStatus) {
		return findByProperty(ORDER_STATUS, orderStatus);
	}

	/* (non-Javadoc)
	 * @see iss.bank.dao.impl.OrderlineDAO#findByOrderCost(java.lang.Object)
	 */
	public List findByOrderCost(Object orderCost) {
		return findByProperty(ORDER_COST, orderCost);
	}

	/* (non-Javadoc)
	 * @see iss.bank.dao.impl.OrderlineDAO#findByCardId(java.lang.Object)
	 */
	public List findByCardId(Object cardId) {
		return findByProperty(CARD_ID, cardId);
	}

	/* (non-Javadoc)
	 * @see iss.bank.dao.impl.OrderlineDAO#findAll()
	 */
	public List findAll() {
		log.debug("finding all Orderline instances");
		try {
			String queryString = "from Orderline";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see iss.bank.dao.impl.OrderlineDAO#merge(iss.bank.entity.Orderline)
	 */
	public Orderline merge(Orderline detachedInstance) {
		log.debug("merging Orderline instance");
		try {
			Orderline result = (Orderline) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see iss.bank.dao.impl.OrderlineDAO#attachDirty(iss.bank.entity.Orderline)
	 */
	public void attachDirty(Orderline instance) {
		log.debug("attaching dirty Orderline instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see iss.bank.dao.impl.OrderlineDAO#attachClean(iss.bank.entity.Orderline)
	 */
	public void attachClean(Orderline instance) {
		log.debug("attaching clean Orderline instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}