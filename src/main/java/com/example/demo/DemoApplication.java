package com.example.demo;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {
	public static void main(String[] args) {
		System.out.println(TaxCalculator.taxRate); // new 없이도 사용 가능~

		TaxCalculator taxCalculator1 = new TaxCalculator(1000);
		System.out.println(taxCalculator1.getTaxedPrice());
		System.out.println(TaxCalculator.taxRate);
	}
}