package com.jacliu.test.platformOutsideInterfaces.common.mybatis.config;

import java.lang.reflect.Method;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(-10) // 保证该AOP在@Transactional之前执行
public class DynamicDataSourceAspect {

	@Pointcut("@annotation(TargetDataSourceAnno)")
	public void dataSourcePointcut() {
	}

	@Around("dataSourcePointcut()")
	public Object doAround(ProceedingJoinPoint pjp) {
		MethodSignature methodSignature = (MethodSignature) pjp.getSignature();
		Method method = methodSignature.getMethod();
		TargetDataSourceAnno typeAnno = method.getAnnotation(TargetDataSourceAnno.class);
		DBTypeEnum dbtypeEnum = typeAnno.value();

		if (dbtypeEnum.equals(DBTypeEnum.DB_OMSWEB)) {
			DBContextHolder.setDBType(DBTypeEnum.DB_OMSWEB);
		} else if (dbtypeEnum.equals(DBTypeEnum.DB_USERCENTER)) {
			DBContextHolder.setDBType(DBTypeEnum.DB_USERCENTER);
		}

		Object result = null;
		try {
			result = pjp.proceed();
		} catch (Throwable throwable) {
			throwable.printStackTrace();
		} finally {
			DBContextHolder.clearDBType();
		}

		return result;
	}

	// @Around("@annotation(TargetDataSourceAnno)")
	// //
	// @Around("@annotation(com.jacliu.test.platformOutsideInterfaces.common.mybatis.config.TargetDataSourceAnno)")
	// public Object aroundOperDeal(ProceedingJoinPoint pjp, TargetDataSourceAnno
	// targetDataSourceAnno) throws Throwable {
	// DBContextHolder.setDBType(targetDataSourceAnno.value());
	// Object retVal = pjp.proceed();
	// DBContextHolder.clearDBType();
	// return retVal;
	// }
}