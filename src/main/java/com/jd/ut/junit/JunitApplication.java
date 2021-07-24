package com.jd.ut.junit;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages="com.jd.ut")
@MapperScan(basePackages = "com.jd.ut.junit.dao")
public class JunitApplication {

    public static void main(String[] args) {
        SpringApplication.run(JunitApplication.class, args);
    }

}
