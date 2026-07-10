package com.example.demo;

import com.example.demo.hero.AgilityHero;
import com.example.demo.hero.StrongHero;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {
	public static void main(String[] args) {
		StrongHero selectedHero = new StrongHero();
		IGameService gameService = new TwoCoinGameService(selectedHero);
		gameService.play();
	}
}