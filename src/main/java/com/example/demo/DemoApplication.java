package com.example.demo;

import com.example.demo.hero.AgilityHero;
import com.example.demo.hero.StrongHero;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {
	public static void main(String[] args) {
		OriginalPrice op = new PaymentPrice("wall clock", 23, 7);
//		op.display();
//		op.display("ice cream"); // error
		PaymentPrice pp = new PaymentPrice("ice cream", 5, 2);
		pp.display("ice cream");

//		StrongHero selectedHero = new StrongHero();
//		IGameService gameService = new TwoCoinGameService(selectedHero);
//		gameService.play();
	}
}