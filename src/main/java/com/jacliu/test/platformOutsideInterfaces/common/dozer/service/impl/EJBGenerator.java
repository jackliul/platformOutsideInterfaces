package com.jacliu.test.platformOutsideInterfaces.common.dozer.service.impl;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.dozer.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import com.jacliu.test.platformOutsideInterfaces.common.dozer.service.IGenerator;
import com.jacliu.test.platformOutsideInterfaces.common.web.model.ResultModel;

@Component
@Lazy(true)
public class EJBGenerator implements IGenerator {

	@Autowired
	protected Mapper dozerMapper;

	@Override
	public <T, S> T convert(S s, Class<T> clz) {
		if (s == null) {
			return null;
		}
		return this.dozerMapper.map(s, clz);
	}

	@Override
	public <T, S> ResultModel<T> convert(ResultModel<S> s, Class<T> clz) {
		if (s == null) {
			return null;
		}
		ResultModel<T> resultSet = new ResultModel<T>();
		// for (S vs : s.getResult()) {
		// resultSet.getResult().add(this.dozerMapper.map(vs, clz));
		// }
		// resultSet.setTotal(s.getTotal());
		// resultSet.setExt(s.getExt());
		// resultSet.setModifyTime(s.getModifyTime());
		return resultSet;
	}

	@Override
	public <T, S> List<T> convert(List<S> s, Class<T> clz) {
		if (s == null) {
			return null;
		}
		List<T> list = new ArrayList<T>();
		for (S vs : s) {
			list.add(this.dozerMapper.map(vs, clz));
		}
		return list;
	}

	@Override
	public <T, S> Set<T> convert(Set<S> s, Class<T> clz) {
		if (s == null) {
			return null;
		}
		Set<T> set = new HashSet<T>();
		for (S vs : s) {
			set.add(this.dozerMapper.map(vs, clz));
		}
		return set;
	}

	@Override
	public <T, S> T[] convert(S[] s, Class<T> clz) {
		if (s == null) {
			return null;
		}
		@SuppressWarnings("unchecked")
		T[] arr = (T[]) Array.newInstance(clz, s.length);
		for (int i = 0; i < s.length; i++) {
			arr[i] = this.dozerMapper.map(s[i], clz);
		}
		return arr;
	}
}