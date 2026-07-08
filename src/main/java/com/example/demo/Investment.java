package com.example.demo;

import lombok.AllArgsConstructor;

// 투자라는 큰 클래스를 만들고, 그 안에서 다양한 투자처에 대한 클래스를 만들어보자.
@AllArgsConstructor
public class Investment {
    private static final double BUDGET = 1000; // 클래스에 귀속된다 (클래스 변수 = 정적 변수(필드))

//    public class Stock {      // 객체 내 클래스
      public static class Stock {   // 클래스 내 클래스
        public static double estimated() { // 객체 메서드
            return BUDGET * 1.4;
        }
    }
}
