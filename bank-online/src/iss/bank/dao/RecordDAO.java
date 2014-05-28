package iss.bank.dao;

import iss.bank.entity.Record;

import java.util.List;

public interface RecordDAO {

	// property constants
	public static final String RECORD_AMOUNT = "recordAmount";
	public static final String RECORD_STATE = "recordState";
	public static final String RECORD_DATE = "recordDate";

	public abstract void save(Record transientInstance);

	public abstract void delete(Record persistentInstance);

	public abstract Record findById(java.lang.Integer id);

	public abstract List findByExample(Record instance);

	public abstract List findByProperty(String propertyName, Object value);

	public abstract List findByRecordAmount(Object recordAmount);

	public abstract List findByRecordState(Object recordState);

	public abstract List findByRecordDate(Object recordDate);

	public abstract List findAll();

	public abstract Record merge(Record detachedInstance);

	public abstract void attachDirty(Record instance);

	public abstract void attachClean(Record instance);

}