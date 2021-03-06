/**   
 * @description  
 * @author "jacliu"   
 * @version 1.0.0   
 */
package com.jacliu.test.platformOutsideInterfaces.common.validation;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.groups.Default;

import com.jacliu.test.platformOutsideInterfaces.common.enums.ValidatorException;

/**
 * @description
 * @author "jacliu"
 * @version 1.0.0 @
 */
public class ValidationUtils {
	private static Validator validator = Validation.buildDefaultValidatorFactory().getValidator();

	public static <T> void validate(T obj) throws ValidatorException {
		Set<ConstraintViolation<T>> set = validator.validate(obj, Default.class);
		System.out.println("xxxxx ");
		if (null != set && set.size() > 0) {
			for (ConstraintViolation<T> cv : set) {
				System.out.println("yyyy ");
				throw new ValidatorException("数据不合法 :: " + cv.getInvalidValue() + " :: " + cv.getMessage());
			}
		}
	}

	public static <T> void validate(T obj, String propertyName) throws ValidatorException {
		Set<ConstraintViolation<T>> set = validator.validateProperty(obj, propertyName, Default.class);
		if (null != set && set.size() > 0) {
			for (ConstraintViolation<T> cv : set) {
				throw new ValidatorException("数据不合法 :: " + cv.getInvalidValue() + " :: " + cv.getMessage());
			}
		}

	}

	public static <T> ValidationResult validateEntity(T obj, String propertyName) {
		ValidationResult result = new ValidationResult();
		Set<ConstraintViolation<T>> set = validator.validate(obj, Default.class);
		if (null != set && set.size() > 0) {
			result.setHasErrors(true);
			Map<String, String> errorMsg = new HashMap<String, String>();
			for (ConstraintViolation<T> cv : set) {
				errorMsg.put(cv.getPropertyPath().toString(), cv.getMessage());
			}
			result.setErrorMsg(errorMsg);
		}
		return result;
	}

	public static <T> ValidationResult validateProperty(T obj, String propertyName) {
		ValidationResult result = new ValidationResult();
		Set<ConstraintViolation<T>> set = validator.validateProperty(obj, propertyName, Default.class);
		if (null != set && set.size() > 0) {
			result.setHasErrors(true);
			Map<String, String> errorMsg = new HashMap<String, String>();
			for (ConstraintViolation<T> cv : set) {
				errorMsg.put(propertyName, cv.getMessage());
			}
			result.setErrorMsg(errorMsg);
		}
		return result;
	}
}
