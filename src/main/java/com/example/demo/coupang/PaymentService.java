package com.example.demo.coupang;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class PaymentService {
    private final OrderRepository orderRepository;

    public Order payment(Integer orderId, PaymentMethod method) {
        Order order = orderRepository.retrieve(orderId);
        order.pay(method);

        System.out.println("-- PaymentService.payment : 결제 완료 --" + order);
        System.out.println("-- PaymentService.payment : 다음");
        return orderRepository.update(order);
    }
}
