package com.performanceengineering.customerdashboard.template;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class customresttemplate {

    @Bean
    @LoadBalanced
    public RestTemplate getresttemplate() {
        return new RestTemplate();
    }
}
