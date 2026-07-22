package com.example.demo.weeklyPaper;

public interface Payment {
    void pay();
    void refund();
//    void saveAddress(); // SRP 원칙 위반? -> 기능을 잘게 쪼개야 한다.
}
