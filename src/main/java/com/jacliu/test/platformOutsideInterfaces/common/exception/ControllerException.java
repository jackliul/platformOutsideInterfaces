package com.jacliu.test.platformOutsideInterfaces.common.exception;

import com.jacliu.test.platformOutsideInterfaces.common.enums.IEnumCode;

/**
 * 控制层异常
 *
 * @author jacliu
 * @date 2017.05.31
 */
public class ControllerException extends BaseException {
	/**
	 */
	private static final long serialVersionUID = -1154673256061731033L;

	public ControllerException() {
		super();
	}

	public ControllerException(IEnumCode code) {
		super(code);
	}

	public ControllerException(IEnumCode code, String message) {
		super(code, message);
	}

	public ControllerException(IEnumCode code, String message, String solution) {
		super(code, message, solution);
	}

	public ControllerException(String msg) {
		super(msg);
	}
}
