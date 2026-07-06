package com.example.demo;

import com.example.demo.member.Administrator;
import com.example.demo.member.Member;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		Administrator admin1 = new Administrator("Arthur", "arthur@example.com", "DEVELOPER");
		Administrator admin2 = new Administrator("Barney", "barney@example.com", "DESIGNER");

		System.out.println("---");
		System.out.println(admin1);              // 객체
		System.out.println(admin1.toString());   // 객체
		System.out.println(admin1.getName());    // 필드 중 name

		System.out.println("---");
		System.out.println(admin2);              // 객체
		System.out.println(admin2.toString());   // 객체
		System.out.println(admin2.getName());    // 필드 중 name
	}
}
