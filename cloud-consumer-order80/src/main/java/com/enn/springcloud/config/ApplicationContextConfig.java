package com.enn.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ApplicationContextConfig {

    @Bean
    @LoadBalanced //负载均衡，只有开启这个注解，才能通过服务的名称访问集群的服务提供者，不然是不能知道要访问哪一台服务提供者机器，因为所有的机器都是一个服务名称
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
    //applicationContext.xml <bean id="" class="">
}
