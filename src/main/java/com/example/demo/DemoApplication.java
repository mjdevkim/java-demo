package com.example.demo;

//import com.example.demo.member.Administrator;
import com.example.demo.member.Member;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		Member mj = new Member(1, "mj", 20, "");

		System.out.println("---");
		System.out.println(mj);
		System.out.println(mj.toString());

		// mj.setAge(23); 접근제어자를 Private으로 바꿔서 외부에서 호출 불가
		mj.setEmail("mj@different.com");

		System.out.println(mj.getAge());
		System.out.println(mj.getEmail());
	}
}
