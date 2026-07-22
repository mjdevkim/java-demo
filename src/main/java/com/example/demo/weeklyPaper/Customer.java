package com.example.demo.weeklyPaper;

import lombok.AllArgsConstructor;

public class Customer {
    private Payment payment;

    public void makePayment(Payment payment) {
        payment.pay();
    }

    public void makeRefund(Payment payment) {
        payment.refund();
    }
}
