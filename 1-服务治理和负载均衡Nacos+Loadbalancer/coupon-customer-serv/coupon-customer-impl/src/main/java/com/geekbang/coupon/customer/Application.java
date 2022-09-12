package com.geekbang.coupon.customer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableJpaAuditing
@EnableTransactionManagement
@EnableJpaRepositories(basePackages = {"com.geekbang"})
@EntityScan(basePackages = {"com.geekbang"})
@EnableDiscoveryClient
//@LoadBalancerClient(value = "coupon-template-serv", configuration = CanaryRuleConfiguration.class)
@EnableFeignClients(basePackages = {"com.geekbang"})
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
