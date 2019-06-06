package com.hm.configclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RefreshScope
@RestController
public class Test {
	@Value("${env}")
	String env;
	
	@GetMapping("/test")
	public String getEnv(){
		
		return env;
	}

}
