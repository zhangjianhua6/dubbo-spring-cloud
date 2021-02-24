package com.alibaba.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication(scanBasePackages = "com.alibaba.cloud")
public class DubboProviderSampleApplication {
    public static void main(String[] args) {
        SpringApplication.run(DubboProviderSampleApplication.class, args);
    }
}
