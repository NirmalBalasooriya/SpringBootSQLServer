package com.blogspot.nirmal.springboot;

import javax.sql.DataSource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jms.annotation.EnableJms;

@ComponentScan({ "com.blogspot.nirmal.springboot" })
@EnableJpaRepositories("com.blogspot.nirmal.springboot.dao")
@SpringBootApplication(scanBasePackages = { "com.blogspot.nirmal.springboot" })
@EnableJms
public class Application {
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
