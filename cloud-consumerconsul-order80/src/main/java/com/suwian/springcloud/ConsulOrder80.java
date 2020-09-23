package com.suwian.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author : sirc_hzr
 * @version : 1.0
 * @date : 2020/6/23 00:19
 */

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
@EnableDiscoveryClient
public class ConsulOrder80 {
    public static void main(String[] args) {
        SpringApplication.run(ConsulOrder80.class, args);
    }
}
