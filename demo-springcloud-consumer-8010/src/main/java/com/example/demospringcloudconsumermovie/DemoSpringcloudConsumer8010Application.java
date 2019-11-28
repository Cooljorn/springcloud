package com.example.demospringcloudconsumermovie;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class DemoSpringcloudConsumer8010Application {
    public static void main(String[] args) {
        SpringApplication.run(DemoSpringcloudConsumer8010Application.class, args);
    }

}

