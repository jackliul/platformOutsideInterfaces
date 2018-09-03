package com.jacliu.test.platformOutsideInterfaces.common.enums;

public enum EnumLogLevel {

	INFO((short) 2), WARN((short) 3), ERROR((short) 4), DEBUG((short) 1);

	short code;

	EnumLogLevel(short code) {
		this.code = code;
	}

	public short getCode() {
		return code;
	}
}
