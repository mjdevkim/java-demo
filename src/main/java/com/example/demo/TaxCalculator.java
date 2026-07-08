package com.example.demo;

import lombok.Getter;

@Getter
public class TaxCalculator {
    private int originalPrice;
    public static double taxRate = 0.11;
    private double taxedPrice;

    public TaxCalculator(int originalPrice) {
        this.originalPrice = originalPrice;
        this.taxedPrice = taxRate * originalPrice; // "this.taxRate"라고 굳이 할 필요 없음
    }
}
