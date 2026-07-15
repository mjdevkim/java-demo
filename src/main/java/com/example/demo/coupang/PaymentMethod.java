package com.example.demo.coupang;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;

@Getter
@RequiredArgsConstructor
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
enum PaymentMethod {
    CARD("카드결제", 0.00),
    CASH("현금결제", 0.02),
    BANK("통장입금", 0.01);

    String method;
    Double discount;

    public static PaymentMethod from(String method) {
        for (PaymentMethod each : PaymentMethod.values()) {
            if (each.name().equals(method)) {
                return each;
            }
        }
        throw new RuntimeException("찾으시는 payment type이 없습니다. - 입력받은 문자열: " + method);
    }
}
