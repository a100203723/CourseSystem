package cn.itcast.dao;

import java.util.List;

import cn.itcast.entity.Student;

public interface UserDao {
	public void save(Object object);
	public void add(Object object);
	public void delete(Object object);
	public void update(Object object);
	public List findall(Object object);
	

}
