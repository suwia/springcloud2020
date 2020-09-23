package com.suwian.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author : sirc_hzr
 * @version : 1.0
 * @date : 2020/6/22 23:47
 */

@RestController
@Slf4j
@RequestMapping("/payment")
public class OrderZKController {

    public static final String INVOME_URL = "http://cloud-payment-service";

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/zkTest")
    public String payment() {
        return restTemplate.getForObject(INVOME_URL + "/payment/zkTest", String.class);
    }
}
