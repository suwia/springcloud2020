package com.suwian.springcloud.controller;

import com.suwian.springcloud.entities.CommonResult;
import com.suwian.springcloud.entities.Payment;
import com.suwian.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author : sirc_hzr
 * @version : 1.0
 * @date : 2020/4/18 14:05
 */
@RestController
@RequestMapping("/payment")
@Slf4j
public class PaymentController {

    private final PaymentService paymentService;
    private final DiscoveryClient discoveryClient;

    @Value("${server.port}")
    private String port;

    @Autowired
    public PaymentController(PaymentService paymentService, DiscoveryClient discoveryClient) {
        this.paymentService = paymentService;
        this.discoveryClient = discoveryClient;
    }

    @GetMapping("/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") long id) {
        Payment payment = paymentService.getPaymentById(id);
        return new CommonResult<>(1, "操作成功, " + port, payment);
    }

    @PostMapping("/create")
    public CommonResult create(@RequestBody Payment payment) {
        int result = paymentService.create(payment);
        if (0 < result) {
            return new CommonResult(1, "操作成功", null);
        } else {
            return new CommonResult(0, "操作失败", null);
        }
    }

    @GetMapping("/discovery")
    public Object getDiscovery() {
        List<String> services = discoveryClient.getServices();
        for (String service : services) {
            log.info(service);
        }

        List<ServiceInstance> instances = discoveryClient.getInstances("CLOUD-PAYMENT-SERVICE");
        for (ServiceInstance instance : instances) {
            log.info(instance.getInstanceId() + "/t" + instance.getServiceId() + "/t" + instance.getHost() + "/t" + instance.getPort() + "/t" + instance.getUri());
        }

        return discoveryClient;
    }
}
