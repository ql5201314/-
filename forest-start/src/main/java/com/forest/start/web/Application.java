package com.forest.start.web;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAutoConfiguration
@ComponentScan(basePackages = "com.forest.manage.web,com.forest.manager,com.forest.common.dal")
@SpringBootApplication
@MapperScan(basePackages = "com.forest.common.dal.dao")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
