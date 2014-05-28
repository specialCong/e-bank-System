package iss.bank.dao;

import iss.bank.entity.News;

import java.util.List;

public interface NewsDAO {

	// property constants
	public static final String NEWS_TITLE = "newsTitle";
	public static final String NEWS_DATE = "newsDate";
	public static final String NEWS_CONTENT = "newsContent";

	public abstract void save(News transientInstance);

	public abstract void delete(News persistentInstance);

	public abstract News findById(java.lang.Integer id);

	public abstract List findByExample(News instance);

	public abstract List findByProperty(String propertyName, Object value);

	public abstract List findByNewsTitle(Object newsTitle);

	public abstract List findByNewsDate(Object newsDate);

	public abstract List findByNewsContent(Object newsContent);

	public abstract List findAll();

	public abstract News merge(News detachedInstance);

	public abstract void attachDirty(News instance);

	public abstract void attachClean(News instance);

}