package com.example.demo.weeklyPaper;

public class TossPayment implements Payment {
    @Override
    public void pay() {
        System.out.println("Toss payment complete");

    }

    @Override
    public void refund() {
        System.out.println("Toss refund complete");

    }
}
