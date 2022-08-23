package com.enn.springcloud.controller;

import com.enn.springcloud.entities.CommonResult;
import com.enn.springcloud.entities.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@Slf4j
public class OrderZKController {
    public static final String INVOKE_URL = "http://cloud-provider-payment";

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/consumer/paymentZK/{id}")
    public CommonResult<Payment> paymentInfo(@PathVariable("id") Long id){
        return restTemplate.getForObject(INVOKE_URL+"/paymentZK/get/" + id, CommonResult.class);
    }

}
