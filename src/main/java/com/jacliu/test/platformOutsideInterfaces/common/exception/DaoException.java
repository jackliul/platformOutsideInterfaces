package com.jacliu.test.platformOutsideInterfaces.common.exception;

import com.jacliu.test.platformOutsideInterfaces.common.enums.IEnumCode;

/**
 * 数据访问层异常
 *
 * @author jacliu
 * @date 2017.05.31
 */
public class DaoException extends BaseException {

	private static final long serialVersionUID = -7461643287734554832L;

	public DaoException(IEnumCode code) {
		super(code);
	}

	public DaoException(String msg) {
		super(msg);
	}

}
