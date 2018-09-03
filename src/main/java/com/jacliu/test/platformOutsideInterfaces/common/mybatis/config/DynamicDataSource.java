package com.jacliu.test.platformOutsideInterfaces.common.mybatis.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

public class DynamicDataSource extends AbstractRoutingDataSource {
	private static final Logger log = LoggerFactory.getLogger(DynamicDataSource.class);

	@Override
	protected Object determineCurrentLookupKey() {
		DBTypeEnum dbType = DBContextHolder.getDBType();
		if (dbType != null) {
			log.debug("线程中的数据源为：{}", dbType.getValue());
			return dbType.getValue();
		}
		return DBTypeEnum.DB_INTERFACES.getValue();
	}

}