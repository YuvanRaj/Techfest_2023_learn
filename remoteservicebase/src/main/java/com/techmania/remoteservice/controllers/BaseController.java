
package com.techmania.remoteservice.controllers;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BaseController {

	private static final Logger logger = LogManager.getLogger(BaseController.class);

	@RequestMapping("/")
	public String index() throws Exception {
		logger.info("**************BaseController.index**************");
		List<String> test = new ArrayList<String>();
		String value = "FALSE";
		return "Greetings from Spring Boot!" + "Yuvaraj";
	}

}
