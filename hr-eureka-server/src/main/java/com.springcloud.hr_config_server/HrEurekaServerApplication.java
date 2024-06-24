package com.springcloud.hr_config_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class HrEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(HrEurekaServerApplication.class, args);
	}

}
