package iss.bank.dao;

import iss.bank.entity.Card;

import java.util.List;

public interface CardDAO {

	// property constants
	public static final String CARD_NUM = "cardNum";
	public static final String BALANCE = "balance";
	public static final String STATUS = "status";

	public abstract void save(Card transientInstance);

	public abstract void delete(Card persistentInstance);

	public abstract Card findById(java.lang.Integer id);

	public abstract List findByExample(Card instance);

	public abstract List findByProperty(String propertyName, Object value);

	public abstract List findByCardNum(Object cardNum);

	public abstract List findByBalance(Object balance);

	public abstract List findByStatus(Object status);

	public abstract List findAll();

	public abstract Card merge(Card detachedInstance);

	public abstract void attachDirty(Card instance);

	public abstract void attachClean(Card instance);

}