package iss.bank.dao.impl;

import iss.bank.dao.CardDAO;
import iss.bank.entity.Card;

import java.util.List;
import java.util.Set;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for Card
 * entities. Transaction control of the save(), update() and delete() operations
 * can directly support Spring container-managed transactions or they can be
 * augmented to handle user-managed Spring transactions. Each of these methods
 * provides additional information for how to configure it for the desired type
 * of transaction control.
 * 
 * @see iss.bank.entity.Card
 * @author MyEclipse Persistence Tools
 */

public class CardDaoImpl extends HibernateDaoSupport implements CardDAO {
	private static final Log log = LogFactory.getLog(CardDaoImpl.class);
	/* (non-Javadoc)
	 * @see iss.bank.entity.CardDAO#save(iss.bank.entity.Card)
	 */
	public void save(Card transientInstance) {
		log.debug("saving Card instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see iss.bank.entity.CardDAO#delete(iss.bank.entity.Card)
	 */
	public void delete(Card persistentInstance) {
		log.debug("deleting Card instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see iss.bank.entity.CardDAO#findById(java.lang.Integer)
	 */
	public Card findById(java.lang.Integer id) {
		log.debug("getting Card instance with id: " + id);
		try {
			Card instance = (Card) getSession().get("iss.bank.entity.Card", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see iss.bank.entity.CardDAO#findByExample(iss.bank.entity.Card)
	 */
	public List findByExample(Card instance) {
		log.debug("finding Card instance by example");
		try {
			List results = getSession().createCriteria("iss.bank.entity.Card")
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
	 * @see iss.bank.entity.CardDAO#findByProperty(java.lang.String, java.lang.Object)
	 */
	public List findByProperty(String propertyName, Object value) {
		log.debug("finding Card instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Card as model where model."
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
	 * @see iss.bank.entity.CardDAO#findByCardNum(java.lang.Object)
	 */
	public List findByCardNum(Object cardNum) {
		return findByProperty(CARD_NUM, cardNum);
	}

	/* (non-Javadoc)
	 * @see iss.bank.entity.CardDAO#findByBalance(java.lang.Object)
	 */
	public List findByBalance(Object balance) {
		return findByProperty(BALANCE, balance);
	}

	/* (non-Javadoc)
	 * @see iss.bank.entity.CardDAO#findByStatus(java.lang.Object)
	 */
	public List findByStatus(Object status) {
		return findByProperty(STATUS, status);
	}

	/* (non-Javadoc)
	 * @see iss.bank.entity.CardDAO#findAll()
	 */
	public List findAll() {
		log.debug("finding all Card instances");
		try {
			String queryString = "from Card";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see iss.bank.entity.CardDAO#merge(iss.bank.entity.Card)
	 */
	public Card merge(Card detachedInstance) {
		log.debug("merging Card instance");
		try {
			Card result = (Card) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see iss.bank.entity.CardDAO#attachDirty(iss.bank.entity.Card)
	 */
	public void attachDirty(Card instance) {
		log.debug("attaching dirty Card instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see iss.bank.entity.CardDAO#attachClean(iss.bank.entity.Card)
	 */
	public void attachClean(Card instance) {
		log.debug("attaching clean Card instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}