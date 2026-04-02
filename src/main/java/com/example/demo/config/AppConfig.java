package com.example.demo.config;
 

import com.example.demo.discount.FixDiscountPolicy;
import com.example.demo.discount.DiscountPolicy;
import com.example.demo.service.OrderService;
 

public class AppConfig {
 

    public DiscountPolicy discountPolicy() {
        return new FixDiscountPolicy(); // 여기서 선택
    }
 

    public OrderService orderService() {
        return new OrderService(discountPolicy());
    }
}