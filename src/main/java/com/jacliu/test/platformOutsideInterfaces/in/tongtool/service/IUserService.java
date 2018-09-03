package com.jacliu.test.platformOutsideInterfaces.in.tongtool.service;

import java.util.List;
import java.util.Map;

import com.jacliu.test.platformOutsideInterfaces.common.mybatis.service.BaseService;
import com.jacliu.test.platformOutsideInterfaces.in.tongtool.domain.SUser;

public interface IUserService extends BaseService<SUser> {

	List<SUser> find(Map<String, Object> params);

}
