package com.dsb.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringbootdemoApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringbootdemoApplication.class, args);
		//HIS-134 CHANGES COMPLETED
		System.out.println("HIS-134 CHAGES");
		System.out.println("This is Main Branch");
	}

}
