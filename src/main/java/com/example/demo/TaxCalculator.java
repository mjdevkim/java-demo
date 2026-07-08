package com.example.demo;

import lombok.Getter;

@Getter
public class TaxCalculator {
    public static final double taxRate = 0.11;

    private int originalPrice;
    private double taxedPrice;

    public TaxCalculator(int originalPrice) {
        this.originalPrice = originalPrice;
        this.taxedPrice = taxRate * originalPrice; // "this.taxRate"라고 굳이 할 필요 없음
    }
}
