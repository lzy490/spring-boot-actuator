package com.yds.demo.test;

import org.springframework.cloud.client.loadbalancer.RestTemplateCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfiguretion {


    @Bean
    public RestTemplateCustomizer restTemplateCustomizer() {
        return restTemplate -> {};
    }
}
