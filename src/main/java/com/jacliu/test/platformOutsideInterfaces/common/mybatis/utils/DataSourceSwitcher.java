package com.jacliu.test.platformOutsideInterfaces.common.mybatis.utils;

import com.jacliu.test.platformOutsideInterfaces.common.mybatis.config.DBContextHolder;
import com.jacliu.test.platformOutsideInterfaces.common.mybatis.config.DBTypeEnum;

public class DataSourceSwitcher {

	public static void execute(DBTypeEnum dbType, CallBack callBack) {
		DBContextHolder.setDBType(dbType);
		callBack.run();
		DBContextHolder.clearDBType();
	}

	public static abstract class CallBack {
		public abstract void run();
	}

}
