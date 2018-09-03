package com.jacliu.test.platformOutsideInterfaces.common.swagger2;

import org.springframework.stereotype.Component;

@Component
public class SwaggerEnvConfig {

	private boolean enableSwagger;

	public boolean isEnableSwagger() {
		return enableSwagger;
	}

	public void setEnableSwagger(boolean enableSwagger) {
		this.enableSwagger = enableSwagger;
	}
}