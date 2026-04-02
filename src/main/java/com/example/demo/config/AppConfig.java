package com.example.demo.config;
 
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.example.demo.discount.DiscountPolicy;
import com.example.demo.discount.RateDiscountPolicy;

@Configuration
@ComponentScan(basePackages = "com.example.demo")
public class AppConfig {
    @Bean
    public DiscountPolicy discountPolicy(){
        return new RateDiscountPolicy();
    }
}