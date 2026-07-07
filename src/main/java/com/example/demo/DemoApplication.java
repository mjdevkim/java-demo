package com.example.demo;

//import com.example.demo.member.Administrator;
import com.example.demo.member.Member;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {
	public static void main(String[] args) {
		Member member = Member.builder()
				.name("Aaron")
				.email("aaron@example.com")
				.build();
		System.out.println(member);

		Member member2 = Member.builder()
				// name, email을 제외한 필드는 설정 불가
//				.id("123")
//				.age("19")
				.build();
		System.out.println(member2);

	}
}
