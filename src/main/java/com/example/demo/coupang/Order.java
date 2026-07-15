package com.example.demo.coupang;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

// 절대 @Setter 사용 X = DDD(도메인 주도 개발)
@Getter
@RequiredArgsConstructor
public class Order {
    private final Integer id = 1;
    private final String product;
    private PaymentMethod measure;
    private OrderStatus status = OrderStatus.PENDING_PAYMENT;

    public void pay(PaymentMethod measure) {
        this.measure = measure;
        this.status = OrderStatus.COMPLETE_PAYMENT;
    }

    public void departed() {
        this.status = OrderStatus.DELIVERY_DEPARTED;
    }

    public void arrived() {
        this.status = OrderStatus.DELIVERY_ARRIVED;
    }
}
