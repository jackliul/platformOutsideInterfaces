package com.jacliu.test.platformOutsideInterfaces.common.mybatis.config;

import java.util.Arrays;

public enum DBTypeEnum {
	DB_INTERFACES("interfaces", "interfaces数据库,默认的数据库"), DB_OMSWEB("omsweb", "omsweb数据库"), DB_USERCENTER("usercenter",
			"usercenter数据库");

	private String value;
	private String desc;

	private DBTypeEnum(String value, String description) {
		this.value = value;
		this.desc = description;
	}

	public String getValue() {
		return value;
	}

	public String getDesc() {
		return desc;
	}

	@Override
	public String toString() {
		return "{" + value + ":" + desc + "}";
	}

	public static DBTypeEnum from(String value) {
		for (DBTypeEnum item : values()) {
			if (item.getValue() == value) {
				return item;
			}
		}
		throw new IllegalArgumentException(
				String.format("非法的输入参数 '%s' ! 必须是%s中的其中一个。", value, Arrays.asList(values()).toString()));
	}

}