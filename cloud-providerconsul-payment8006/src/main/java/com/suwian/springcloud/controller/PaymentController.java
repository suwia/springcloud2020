package com.suwian.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @author : sirc_hzr
 * @version : 1.0
 * @date : 2020/6/23 00:11
 */

@RestController
@Slf4j
@RequestMapping("/payment")
public class PaymentController {
    @Value("${server.port}")
    private String port;


    @GetMapping("/consulTest")
    public String consulTest() {
        return "springcloud with consulTest:"+port+"\t"+ UUID.randomUUID().toString();
    }
}
