package com.example.demo;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.Arrays;

@SpringBootApplication
public class DemoApplication {
	public static void main(String[] args) {
		Investment investment = new Investment();

		// investment 객체에서 Stock 클래스의 객체를 new Stock();으로 만든것
//		Investment.Stock stockInvestment = investment.new Stock();

		Investment.Stock stockInvestment = new Investment.Stock();
		// estimated()가 객체 메서드이기 떄문에 객체 initiate을 해야 한다.
		// stockInvestment.estimated();

		// estimated()가 클래스 메서드라면
		Investment.Stock.estimated();


	}
}