package cn.itcast.service.impl;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import cn.itcast.dao.base.BaseDaoI;
import cn.itcast.service.base.BaseServiceI;

/**
 * »ù´¡ÒµÎñÂß¼­
 * 
 * @author 
 * 
 * @param <T>
 */
@Transactional
public class BaseServiceImpl<T> implements BaseServiceI<T> {
	
	@Autowired
	private BaseDaoI<T> baseDao;

	
	public Serializable save(T o) {
		return baseDao.save(o);
	}
	
	public void saveList(List<T> l) {
		baseDao.saveList(l);
	}

	
	public void delete(T o) {
		baseDao.delete(o);
	}

	
	public void update(T o) {
		baseDao.update(o);
	}

	
	public void saveOrUpdate(T o) {
		baseDao.saveOrUpdate(o);
	}

	
	public T getById(Serializable id) {
		@SuppressWarnings("unchecked")
		Class<T> c = (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
		return baseDao.getById(c, id);
	}

	
	public T getByHql(String hql) {
		return baseDao.getByHql(hql);
	}

	
	public T getByHql(String hql, Map<String, Object> params) {
		return baseDao.getByHql(hql, params);
	}
	
	public List<T> find(String hql) {
		return baseDao.find(hql);
	}

	
	public List<T> find(String hql, Map<String, Object> params) {
		return baseDao.find(hql, params);
	}
	
	
	
	public List<T> find(String hql, int page, int rows) {
		return baseDao.find(hql, page, rows);
	}
	
	public List<T> find(String hql, Map<String, Object> params, int page, int rows) {
		return baseDao.find(hql, params, page, rows);
	}

	public Long count(String hql) {
		return baseDao.count(hql);
	}

	
	public Long count(String hql, Map<String, Object> params) {
		return baseDao.count(hql, params);
	}

	public int executeHql(String hql) {
		return baseDao.executeHql(hql);
	}

	
	public int executeHql(String hql, Map<String, Object> params) {
		return baseDao.executeHql(hql, params);
	}

	
	public List findBySql(String sql) {
		return baseDao.findBySql(sql);
	}
	public List findColumnBySql(String sql){
		return baseDao.findColumnBySql(sql);
	}

	
	public List findBySql(String sql, int page, int rows) {
		return baseDao.findBySql(sql, page, rows);
	}

	
	public List findBySql(String sql, Map<String, Object> params) {
		return baseDao.findBySql(sql, params);
	}

	
	public List findBySql(String sql, Map<String, Object> params, int page, int rows) {
		return baseDao.findBySql(sql, params, page, rows);
	}

	
	public int executeSql(String sql) {
		return baseDao.executeSql(sql);
	}

	
	public int executeSql(String sql, Map<String, Object> params) {
		return baseDao.executeSql(sql, params);
	}

	
	public Long countBySql(String sql) {
		return baseDao.countBySql(sql);
	}

	
	public Long countBySql(String sql, Map<String, Object> params) {
		return baseDao.countBySql(sql, params);
	}
	
	public String getBySql(String sql) {
		return baseDao.getBySql(sql);
	}

	public List<T> find(Class<T> t) {
		return baseDao.find("from " + t.getSimpleName());
	}

	public List<T> find(Class<T> t, int page, int rows) {
		return baseDao.find("from " + t.getSimpleName(), page, rows);
	}

	public Long count(Class<T> t) {
		return baseDao.count("select count(t) from " + t.getSimpleName() + " t");
	}
}
