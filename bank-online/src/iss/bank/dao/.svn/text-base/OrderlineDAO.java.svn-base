package iss.bank.dao;

import iss.bank.entity.Orderline;

import java.util.List;

public interface OrderlineDAO {

	// property constants
	public static final String ORDER_STATUS = "orderStatus";
	public static final String ORDER_COST = "orderCost";
	public static final String CARD_ID = "cardId";

	public abstract void save(Orderline transientInstance);

	public abstract void delete(Orderline persistentInstance);

	public abstract Orderline findById(java.lang.Integer id);

	public abstract List findByExample(Orderline instance);

	public abstract List findByProperty(String propertyName, Object value);

	public abstract List findByOrderStatus(Object orderStatus);

	public abstract List findByOrderCost(Object orderCost);

	public abstract List findByCardId(Object cardId);

	public abstract List findAll();

	public abstract Orderline merge(Orderline detachedInstance);

	public abstract void attachDirty(Orderline instance);

	public abstract void attachClean(Orderline instance);

}