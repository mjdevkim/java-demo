package com.example.demo.coupang;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class OrderService {
    private final OrderRepository orderRepository;

    public Order create(String product) {
        return orderRepository.create(product);
    }
}
