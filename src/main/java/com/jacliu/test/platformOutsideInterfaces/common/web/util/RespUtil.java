package com.jacliu.test.platformOutsideInterfaces.common.web.util;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.jacliu.test.platformOutsideInterfaces.common.enums.EnumResCode;
import com.jacliu.test.platformOutsideInterfaces.common.enums.IEnumCode;
import com.jacliu.test.platformOutsideInterfaces.common.exception.BaseException;
import com.jacliu.test.platformOutsideInterfaces.common.web.model.ResultModel;

/**
 * 客户端返回工具类
 *
 * @author jacliu
 * @date 2017.05.31
 */
@SuppressWarnings("rawtypes")
public class RespUtil {
	static Logger log = LoggerFactory.getLogger(RespUtil.class);

	/**
	 * @return
	 */
	public static ResultModel success() {
		return getResultModel(EnumResCode.OK, null);
	}

	public static <T> ResultModel result(IEnumCode code, T result) {
		return getResultModel(code, result);
	}

	public static <T> ResultModel error() {
		return getResultModel(EnumResCode.ERROR, null);
	}

	private static <T> ResultModel getResultModel(IEnumCode code, T result) {
		String body = null;
		if (result != null) {
			body = JsonUtil.toJson(result);
		}
		return setResultModel(code, body);
	}

	private static <T> ResultModel setResultModel(IEnumCode code, T result) {
		ResultModel<T> resultModel = new ResultModel<T>();
		resultModel.setResult_code(code.getCode());
		resultModel.setMessage(code.getMessage());
		resultModel.setSolution(code.getSolution());
		resultModel.setBody(result);

		return resultModel;
	}

	public static void error(Exception ex, HttpServletResponse response) throws IOException {
		ResultModel<Object> responseModel = new ResultModel<Object>();

		if (ex instanceof BaseException) {
			setErrorResponse(responseModel, ex);
		} else {
			Throwable throwable = ex.getCause();
			if (null != throwable && throwable instanceof BaseException) {
				setErrorResponse(responseModel, throwable);
			} else {
				responseModel.setResult_code(EnumResCode.ERROR.getCode());
				responseModel.setMessage(EnumResCode.ERROR.getMessage());
			}
		}

		headerResponse(response);
		writer(responseModel, response);

	}

	private static void writer(ResultModel responseModel, ServletResponse response) {

		headerResponse(response);
		PrintWriter pw = null;
		try {
			pw = response.getWriter();
			pw.write(JsonUtil.toJson(responseModel));
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			pw.flush();
			pw.close();
		}

	}

	public static void writer(EnumResCode code, ServletResponse response) {
		writer(getResultModel(code, null), response);
	}

	private static void setErrorResponse(ResultModel<Object> responseModel, Throwable throwable) {
		BaseException be = (BaseException) throwable;

		if (be.getCode() != null) {
			responseModel.setResult_code(be.getCode().getCode());
			responseModel.setMessage(be.getMessage());
			responseModel.setSolution(be.getSolution());
		} else {
			responseModel.setResult_code(EnumResCode.ERROR.getCode());
			responseModel.setMessage(EnumResCode.ERROR.getMessage());
			responseModel.setSolution(EnumResCode.ERROR.getSolution());
		}
	}

	private static void headerResponse(ServletResponse response) {
		HttpServletResponse resp = (HttpServletResponse) response;
		resp.setHeader("Content-type", "text/html;charset=UTF-8");
		resp.setCharacterEncoding("UTF-8");
	}

}
