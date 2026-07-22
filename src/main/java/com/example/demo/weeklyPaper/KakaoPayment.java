package com.example.demo.weeklyPaper;

public class KakaoPayment implements Payment {

    @Override
    public void pay() {
        System.out.println("Kakao payment complete");

    }

    @Override
    public void refund() {
        System.out.println("Kakao refund complete");

    }
}
