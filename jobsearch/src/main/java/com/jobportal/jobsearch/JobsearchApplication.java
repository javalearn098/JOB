package com.jobportal.jobsearch;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JobsearchApplication {

	public static void main(String[] args) {
		Logger logger = LogManager.getLogger(JobsearchApplication.class);
		logger.info("Started application with logger");
		SpringApplication.run(JobsearchApplication.class, args);
	}

}
