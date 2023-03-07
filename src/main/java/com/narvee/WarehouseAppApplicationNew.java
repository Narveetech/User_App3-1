package com.narvee;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

@SpringBootApplication
public class WarehouseAppApplicationNew {
	
	public static final Logger logger = LoggerFactory.getLogger(WarehouseAppApplicationNew.class);

	public static void main(String[] args) {
		
		logger.info("inside class !!!, Method !!!: main Method");
		logger.debug("loading index page..");
		logger.warn("WARN level message!!");
		logger.error("ERROR level message !!");
System.out.println("newly updated");
		SpringApplication.run(WarehouseAppApplicationNew.class, args);
	}
	
}
