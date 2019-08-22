package com.yx.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer//启动注册中心
public class YaoxiMicroEureka7001Application {

	public static void main(String[] args) {
		SpringApplication.run(YaoxiMicroEureka7001Application.class, args);
	}

}
