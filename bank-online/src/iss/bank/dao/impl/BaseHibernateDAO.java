package iss.bank.dao.impl;

import iss.bank.dao.IBaseHibernateDAO;
import iss.bank.util.HibernateSessionFactory;

import org.hibernate.Session;




/**
 * Data access object (DAO) for domain model
 * @author MyEclipse Persistence Tools
 */
public class BaseHibernateDAO implements IBaseHibernateDAO {
	
	public Session getSession() {
		return HibernateSessionFactory.getSession();
	}
	
}