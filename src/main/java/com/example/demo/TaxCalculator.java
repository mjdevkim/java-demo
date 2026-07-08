package com.example.demo;

import lombok.Getter;

@Getter
public class TaxCalculator {
    public static final double TAX_RATE = 0.11;

    // Static method 정적 메서드 = 유틸리티 메서드 (어디에서든 쓴다)
    public static double calculateTax(int originalPrice) {
        return TAX_RATE * originalPrice;
    }
}
