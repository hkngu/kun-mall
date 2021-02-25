package com.kunmall.product;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class KunmallProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(KunmallProductApplication.class, args);
    }

}
