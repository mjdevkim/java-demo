package com.example.demo;

//import com.example.demo.hero.AgilityHeroRepository;
import com.example.demo.hero.*;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {
	public static void main(String[] args) {
		HeroRepository heroRepo = new AgilityHeroRepository();
		Hero hero = heroRepo.readHero("Quicksilver");

		IGameService gameService = new OneCoinGameService();
		gameService.play(hero);
	}
}