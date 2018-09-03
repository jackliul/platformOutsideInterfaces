package com.jacliu.test.platformOutsideInterfaces.in.tongtool.mapper;

import java.util.List;
import java.util.Map;

import com.jacliu.test.platformOutsideInterfaces.common.mybatis.basemapper.BaseMapper;
import com.jacliu.test.platformOutsideInterfaces.in.tongtool.domain.SUser;

public interface SUserMapper extends BaseMapper<SUser> {

	List<SUser> find(Map<String, Object> params);
}