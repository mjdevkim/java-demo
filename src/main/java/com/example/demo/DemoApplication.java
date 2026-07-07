package com.example.demo;

//import com.example.demo.member.Administrator;
import com.example.demo.member.Member;
import com.example.demo.member.MemberCreateRequestDto;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {
	public static void main(String[] args) {
		MemberCreateRequestDto dto =
				new MemberCreateRequestDto(
						"Leanne",
						"leanne@example.com",
						22);

		Member member = Member.from(dto);
		System.out.println(member);
	}
}