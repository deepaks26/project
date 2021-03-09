package com.git.config.ConfigRepoIntegration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ConfigRepoIntegrationApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigRepoIntegrationApplication.class, args);
	}
	
	

}
