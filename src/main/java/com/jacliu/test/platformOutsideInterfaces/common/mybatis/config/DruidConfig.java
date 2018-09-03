package com.jacliu.test.platformOutsideInterfaces.common.mybatis.config;

import java.util.HashMap;
import java.util.Map;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceBuilder;

@Configuration
public class DruidConfig {

	@Primary
	@Bean(name = "interfacesDataSource")
	@ConfigurationProperties("spring.datasource.druid.interfaces")
	public DataSource interfacesDataSource() {
		return DruidDataSourceBuilder.create().build();
	}

	@Bean(name = "omswebDataSource")
	@ConfigurationProperties("spring.datasource.druid.omsweb")
	public DataSource omswebDataSource() {
		return DruidDataSourceBuilder.create().build();
	}

	@Bean(name = "usercenterDataSource")
	@ConfigurationProperties("spring.datasource.druid.usercenter")
	public DataSource usercenterDataSource() {
		return DruidDataSourceBuilder.create().build();
	}

	@Bean(name = "dataSource")
	public DataSource dynamicDataSource(@Qualifier("interfacesDataSource") DataSource interfacesDataSource,
			@Qualifier("omswebDataSource") DataSource omswebDataSource,
			@Qualifier("usercenterDataSource") DataSource usercenterDataSource) {
		DynamicDataSource dynamicDataSource = new DynamicDataSource();
		// 默认数据源
		dynamicDataSource.setDefaultTargetDataSource(interfacesDataSource);
		// 配置多数据源
		Map<Object, Object> dsMap = new HashMap<>();
		dsMap.put(DBTypeEnum.DB_INTERFACES.getValue(), interfacesDataSource);
		dsMap.put(DBTypeEnum.DB_OMSWEB.getValue(), omswebDataSource);
		dsMap.put(DBTypeEnum.DB_USERCENTER.getValue(), usercenterDataSource);
		dynamicDataSource.setTargetDataSources(dsMap);
		return dynamicDataSource;
	}

	@Bean(name = "sessionFactory")
	public SqlSessionFactory sessionFactory(@Qualifier("dataSource") DataSource dataSource) throws Exception {
		final SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
		sessionFactory.setDataSource(dataSource);
		sessionFactory.setMapperLocations(new PathMatchingResourcePatternResolver()
				.getResources("classpath:com/jacliu/test/platformOutsideInterfaces/*/*/mapper/*.xml"));
		return sessionFactory.getObject();
	}

	@Bean
	public SqlSessionTemplate sqlSessionTemplate(SqlSessionFactory sessionFactory) {
		return new SqlSessionTemplate(sessionFactory);
	}

	@Bean
	public DataSourceTransactionManager transactionManager(@Qualifier("dataSource") DataSource dataSource) {
		return new DataSourceTransactionManager(dataSource);
	}

}