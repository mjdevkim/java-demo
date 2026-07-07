package com.example.demo;

//import com.example.demo.member.Administrator;
import com.example.demo.member.Member;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {
	public static void main(String[] args) {
		Member first = Member.builder()
				.name("first")
				.email("first@example.com")
				.build();
		System.out.println(first);

		Member third = Member.builder()
				.name("third")
				.favorite("Book")
				.favorite("K-Drama")
				.build();
		System.out.println(third);

		Member fourth = Member.builder()
				.name("fourth")
				.age(33)
				.build();
		System.out.println(fourth); // Rejected

	}
}