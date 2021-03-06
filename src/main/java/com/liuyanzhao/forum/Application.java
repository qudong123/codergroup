package com.liuyanzhao.forum;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync //开启异步调用
public class Application {


	public static void main(String[] args) throws Exception {
		SpringApplication.run(Application.class, args);
	}

}
