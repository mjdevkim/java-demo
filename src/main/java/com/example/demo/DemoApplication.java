package com.example.demo;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.Arrays;

@SpringBootApplication
public class DemoApplication {
	public static void main(String[] args) {
		Admin admin = new Admin(1, "admin", "ADMIN");
		System.out.println(admin.toString());
	}
}