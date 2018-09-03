package com.jacliu.test.platformOutsideInterfaces.common.mybatis.service;

import java.util.List;

public interface BaseService<T> {

	public int save(T entity);

	public int save(List<T> entitys);

	public int delete(T entity);

	public int deleteByKey(Object key);

	public int update(T entity);

	public T getByKey(Object key);

	public List<T> getByCondition(T entity);

	public int getCountByCondition(T entity);

	public List<T> getAll();

}