package com.example.demo;

import com.example.demo.hero.*;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {
	public static void main(String[] args) {
		HeroRepository heroRepo = new AgilityHeroRepository(new Hero[]{
				new AgilityHero("Quicksilver"),
				new AgilityHero("Iron Man"),
				new AgilityHero("Bolt")
		});
		Hero selectedHero = heroRepo.readHero("Quicksilver");

		System.out.println("Player Name: " + selectedHero.getName());
		TwoCoinGameService game = new TwoCoinGameService();
		game.play(selectedHero);
	}
}