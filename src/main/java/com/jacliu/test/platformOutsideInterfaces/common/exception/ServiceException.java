package com.jacliu.test.platformOutsideInterfaces.common.exception;

import com.jacliu.test.platformOutsideInterfaces.common.enums.IEnumCode;

/**
 * 业务逻辑层异常
 *
 * @author jacliu
 * @date 2017.05.31
 */
public class ServiceException extends BaseException {

	/**
	 */
	private static final long serialVersionUID = 2668758207300510995L;

	public ServiceException() {
		super();
	}

	public ServiceException(Throwable e) {
		super(e);
	}

	public ServiceException(IEnumCode code) {
		super(code);
	}

	public ServiceException(IEnumCode code, String message) {
		super(code, message);
	}

	public ServiceException(IEnumCode code, String message, String solution) {
		super(code, message, solution);
	}

	public ServiceException(String msg) {
		super(msg);
	}

}
