package com.ajie.shardingjdbc;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan("com.ajie.shardingjdbc.dao")
@SpringBootApplication
public class AjieShardingjdbcApplication {

	public static void main(String[] args) {
		SpringApplication.run(AjieShardingjdbcApplication.class, args);
	}

}
