package iss.bank.dao;

import iss.bank.entity.Userinfo;

import java.util.List;

public interface UserinfoDAO {

	// property constants
	public static final String USERNAME = "username";
	public static final String IDENTITY_NUM = "identityNum";
	public static final String GENDER = "gender";
	public static final String ADDRESS = "address";
	public static final String TELEPHONE = "telephone";
	public static final String BIRTHDAY = "birthday";

	public abstract void save(Userinfo transientInstance);

	public abstract void delete(Userinfo persistentInstance);

	public abstract Userinfo findById(java.lang.Integer id);

	public abstract List findByExample(Userinfo instance);

	public abstract List findByProperty(String propertyName, Object value);

	public abstract List findByUsername(Object username);

	public abstract List findByIdentityNum(Object identityNum);

	public abstract List findByGender(Object gender);

	public abstract List findByAddress(Object address);

	public abstract List findByTelephone(Object telephone);

	public abstract List findByBirthday(Object birthday);

	public abstract List findAll();

	public abstract Userinfo merge(Userinfo detachedInstance);

	public abstract void attachDirty(Userinfo instance);

	public abstract void attachClean(Userinfo instance);

}