package com.jacliu.test.platformOutsideInterfaces.common.dozer.service;

import java.util.List;
import java.util.Set;

import com.jacliu.test.platformOutsideInterfaces.common.web.model.ResultModel;

public interface IGenerator {

	/**
	 * @Description: 单个对象的深度复制及类型转换，vo/domain , po
	 * @param s
	 *            数据对象
	 * @param clz
	 *            复制目标类型
	 * @return
	 * @author banjuer@outlook.com
	 * @Time 2018年5月9日 下午3:53:24
	 */
	<T, S> T convert(S s, Class<T> clz);

	/**
	 * @Description: 深度复制结果集(ResultSet为自定义的分页结果集)
	 * @param s
	 *            数据对象
	 * @param clz
	 *            复制目标类型
	 * @return
	 * @author banjuer@outlook.com
	 * @Time 2018年5月9日 下午3:53:24
	 */
	<T, S> ResultModel<T> convert(ResultModel<S> s, Class<T> clz);

	/**
	 * @Description: list深度复制
	 * @param s
	 *            数据对象
	 * @param clz
	 *            复制目标类型
	 * @return
	 * @author banjuer@outlook.com
	 * @Time 2018年5月9日 下午3:54:08
	 */
	<T, S> List<T> convert(List<S> s, Class<T> clz);

	/**
	 * @Description: set深度复制
	 * @param s
	 *            数据对象
	 * @param clz
	 *            复制目标类型
	 * @return
	 * @author banjuer@outlook.com
	 * @Time 2018年5月9日 下午3:54:39
	 */
	<T, S> Set<T> convert(Set<S> s, Class<T> clz);

	/**
	 * @Description: 数组深度复制
	 * @param s
	 *            数据对象
	 * @param clz
	 *            复制目标类型
	 * @return
	 * @author banjuer@outlook.com
	 * @Time 2018年5月9日 下午3:54:57
	 */
	<T, S> T[] convert(S[] s, Class<T> clz);

}