package com.jacliu.test.platformOutsideInterfaces.in.tongtool.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.jacliu.test.platformOutsideInterfaces.common.mybatis.basemapper.BaseMapper;
import com.jacliu.test.platformOutsideInterfaces.common.mybatis.config.DBTypeEnum;
import com.jacliu.test.platformOutsideInterfaces.common.mybatis.config.TargetDataSourceAnno;
import com.jacliu.test.platformOutsideInterfaces.common.mybatis.service.BaseServiceImpl;
import com.jacliu.test.platformOutsideInterfaces.in.tongtool.domain.SUser;
import com.jacliu.test.platformOutsideInterfaces.in.tongtool.mapper.SUserMapper;
import com.jacliu.test.platformOutsideInterfaces.in.tongtool.service.IUserService;

@Component
public class UserServiceImpl extends BaseServiceImpl<SUser> implements IUserService {

	@Autowired
	private SUserMapper userMapper;

	@Override
	@TargetDataSourceAnno(DBTypeEnum.DB_USERCENTER)
	public List<SUser> find(Map<String, Object> params) {
		params.put("user", 111);
		List<SUser> find = userMapper.find(params);
		return find;
	}

	@Override
	protected BaseMapper<SUser> getMapper() {
		return userMapper;
	}

}
