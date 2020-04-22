package com.dubbo.demo.dubboconsumor;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableDubbo
@SpringBootApplication
public class DubboConsumorApplication {

    public static void main(String[] args) {
        SpringApplication.run(DubboConsumorApplication.class, args);
    }

}
