package com.techmania.remoteservice;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RestController;

@Configuration
@ComponentScan
@SpringBootApplication
@RestController
@EnableAutoConfiguration
public class RemoteserviceApplication {

	private static final Logger logger = LogManager.getLogger(RemoteserviceApplication.class);

	public static void main(String[] args) {
		try {
			logger.debug("************RemoteserviceApplication starts*******");
			SpringApplication application = new SpringApplication(RemoteserviceApplication.class);

			application.run(args);
			logger.info("************RemoteserviceApplication ends*******");
			// SpringApplication.run(RemoteserviceApplication.class, args);
		} catch (Exception ex) {
			System.out.println("error");
		}
	}

}
