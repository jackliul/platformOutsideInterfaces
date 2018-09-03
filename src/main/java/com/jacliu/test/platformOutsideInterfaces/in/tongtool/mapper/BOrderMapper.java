package com.jacliu.test.platformOutsideInterfaces.in.tongtool.mapper;

import java.util.List;
import java.util.Map;

import com.jacliu.test.platformOutsideInterfaces.common.mybatis.basemapper.BaseMapper;
import com.jacliu.test.platformOutsideInterfaces.in.tongtool.domain.BOrder;

public interface BOrderMapper extends BaseMapper<BOrder> {

	List<BOrder> find(Map<String, Object> params);
}