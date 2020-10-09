package com.example.springbootsleuthzipkin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class SpringbootSleuthZipkinApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootSleuthZipkinApplication.class, args);
    }

}
