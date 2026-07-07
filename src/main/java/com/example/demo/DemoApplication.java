package com.example.demo;

//import com.example.demo.member.Administrator;
import com.example.demo.member.Member;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {
	public static void main(String[] args) {
		Member human = Member.builder()
				.name("human")
				.email("human@email.com")
				.age(34)
				.hobby("football")
				.hobby("baseball")
				.build();
		System.out.println(human);

		Member alien = Member.builder()
				.name("alien")
				.email("alien@email.com")
				.age(129)
				.hobby("go to mars")
				.hobby("watch star wars")
				.build();
		System.out.println(alien);
	}
}