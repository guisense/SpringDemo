package com.example.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
@SpringBootApplication
@ServletComponentScan(basePackages = "com.example.util")
@MapperScan(basePackages = "com.example.demo.dao")
public class DemoApplication extends  SpringBootServletInitializer{

	public static void main(String[] args) {

		SpringApplication.run(DemoApplication.class, args);
	}

}
