package com.example.springbootsleuthzipkin.web;

import com.example.springbootsleuthzipkin.config.FeignClientConfig;
import org.slf4j.MDC;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ZipkingExampleConsumer {

    @Autowired
    private FeignClientConfig feignClientConfig;

    @GetMapping("/consumer")
    private String sleuthConsumer() {
        System.out.println("Trace Id for incoming request " + MDC.get("X-B3-TraceId"));
        return feignClientConfig.restProducer();
    }
}
