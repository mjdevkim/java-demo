package com.example.demo.weeklyPaper;

public class CashPayment implements Payment {

    @Override
    public void pay() {
        System.out.println("Cash payment complete");
    }

    @Override
    public void refund() {
        System.out.println("Cash refund complete");
    }
}
