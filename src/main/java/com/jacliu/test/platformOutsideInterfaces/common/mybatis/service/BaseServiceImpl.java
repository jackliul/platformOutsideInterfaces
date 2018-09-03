package com.jacliu.test.platformOutsideInterfaces.common.mybatis.service;

import java.util.List;

import com.jacliu.test.platformOutsideInterfaces.common.mybatis.basemapper.BaseMapper;

public abstract class BaseServiceImpl<T> implements BaseService<T> {

	protected abstract BaseMapper<T> getMapper();

	@Override
	public int save(T entity) {
		return getMapper().insert(entity);
	}

	@Override
	public int save(List<T> entitys) {
		return getMapper().insertList(entitys);
	}

	@Override
	public int delete(T entity) {
		return getMapper().delete(entity);
	}

	@Override
	public int deleteByKey(Object key) {
		return getMapper().deleteByPrimaryKey(key);
	}

	@Override
	public int update(T entity) {
		return getMapper().updateByPrimaryKey(entity);
	}

	@Override
	public T getByKey(Object key) {
		return getMapper().selectByPrimaryKey(key);
	}

	@Override
	public List<T> getByCondition(T entity) {
		return getMapper().select(entity);
	}

	@Override
	public int getCountByCondition(T entity) {
		return getMapper().selectCount(entity);
	}

	@Override
	public List<T> getAll() {
		return getMapper().selectAll();
	}

}
