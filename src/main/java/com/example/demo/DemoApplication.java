package com.example.demo;

import com.example.demo.hero.AgilityHeroRepository;
import com.example.demo.prices.CanadaPaymentPrice;
import com.example.demo.prices.OriginalPrice;
import com.example.demo.prices.KoreaPaymentPrice;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {
	public static void main(String[] args) {
		HeroRepository heroRepository = new AgilityHeroRepository();

//		heroRepository.deleteHero("Slark");
		Hero selectedHero = heroRepository.readHero("Power Ranger");

		IGameService gameService = new TwoCoinGameService(selectedHero);
		gameService.play();
	}
}