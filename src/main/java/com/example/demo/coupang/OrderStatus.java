package com.example.demo.coupang;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;

@Getter
@RequiredArgsConstructor
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
public enum OrderStatus {
    PENDING_PAYMENT("결제대기", true),
    COMPLETE_PAYMENT("결제완료", true),
    DELIVERY_DEPARTED("배송시작", false),
    DELIVERY_ARRIVED("배송완료", false);

    String status;
    boolean cancellable;
}
