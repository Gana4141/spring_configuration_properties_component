package com.nit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.nit.entity.MobilePhones;

@SpringBootApplication
public class BootCore01ConfigurationPropertiesApplication {

	public static void main(String[] args)
	{
	ApplicationContext ctx = SpringApplication.run(BootCore01ConfigurationPropertiesApplication.class, args);
	   MobilePhones mobilePhones =ctx.getBean(MobilePhones.class);
	   System.out.println(mobilePhones);
	}

}
