package com.darren.myblog;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan({"com.darren.myblog"})
@ComponentScan({"com.darren.myblog", "com.darren.myblog.*"})
@MapperScan({"com.darren.myblog.repository"})
public class MyblogProjectBeApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyblogProjectBeApplication.class, args);
	}

}
