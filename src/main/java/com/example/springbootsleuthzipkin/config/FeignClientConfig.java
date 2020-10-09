package com.example.springbootsleuthzipkin.config;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "restConsumer", url = "http://localhost:8080")
public interface FeignClientConfig {

    @RequestMapping(method = RequestMethod.GET, value = "/trace")
    String restProducer();
}
