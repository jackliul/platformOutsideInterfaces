package com.jacliu.test.platformOutsideInterfaces;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

import com.spring4all.swagger.EnableSwagger2Doc;

import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
@EnableSwagger2Doc
@MapperScan(basePackages = "com.jacliu.test.platformOutsideInterfaces.*.*.mapper", sqlSessionFactoryRef = "sessionFactory")
public class PlatformOutsideInterfacesApplication {

	public static void main(String[] args) {
		SpringApplication.run(PlatformOutsideInterfacesApplication.class, args);
	}
}
