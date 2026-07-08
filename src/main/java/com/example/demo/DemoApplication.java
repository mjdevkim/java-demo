package com.example.demo;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.Arrays;

@SpringBootApplication
public class DemoApplication {
	public static void main(String[] args) {
		double myRate = TaxCalculator.calculateTax(2500);
		System.out.println(myRate);

		// 예시: Arrays 클래스의 .sort() 메소드도 Static 메소드다.
		int[] nums = {1,2,3};
		Arrays.sort(nums);
	}
}