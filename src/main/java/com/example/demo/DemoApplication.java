package com.example.demo;

import com.example.demo.hero.*;
import com.example.demo.ramen.MakingRamen;
import com.example.demo.ramen.MakingShinRamen;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {
	public static void main(String[] args) {
//		// Agility Hero
//		CrudRepository<AgilityHero> agilityHeroRepo = new AgilityHeroRepository(new AgilityHero[]{
//				new AgilityHero("Quicksilver"),
//				new AgilityHero("Iron Man"),
//				new AgilityHero("Bolt"),
//				new AgilityHero("Mob Psycho 100")
//		});
//		agilityHeroRepo.create(new AgilityHero("New Hero!"));
//
//		Hero selectedHero = agilityHeroRepo.read("New Hero!");
//
//		System.out.println("\nPlayer Name: " + selectedHero.getName());
//		TwoCoinGameService game = new TwoCoinGameService();
//		game.play(selectedHero);
//
//		// Strength Hero
//		CrudRepository<StrengthHero> strenghHeroRepo = new StrengthHeroRepository(new StrengthHero[]{
//				new StrengthHero("Hulk")
//		});
//		strenghHeroRepo.create(new StrengthHero("Hulk II"));
//		Hero selectedHero2 = strenghHeroRepo.read("Hulk II");
//
//		System.out.println("\nPlayer 2 Name: " + selectedHero2.getName());
//		OneCoinGameService game2 = new OneCoinGameService();
//		game2.play(selectedHero2);
		MakingRamen ramen = new MakingShinRamen();
		ramen.boiling();
	}
}