package com.example.demo;

import com.example.demo.coupang.*;
import com.example.demo.hero.*;
import com.example.demo.optional.Person;
import com.example.demo.ramen.MakingRamen;
import com.example.demo.ramen.MakingShinRamen;
import com.example.demo.repeater.Repeatee;
import com.example.demo.repeater.Repeater;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.*;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		// 중간 연산자
		// 최종 연산자
		List<Player> playerList = new ArrayList<>(Game.HISTORY.get(0).getPlayers().values());

		System.out.println(" -- Stream.forEach -- ");
		Stream<Player> playerStream = playerList.stream();
		String accumulatedHeroes = playerList.stream() // Stream<Player> = [Player, Player, Player]
				/* Stream<Player> */	.filter(player -> player.getSide().equals(Side.RADIANT))
				/* Stream<Player> */	.filter(player -> player.getKill() >= 5)
				/* Stream<Hero>   */	.map(Player::getPickedHero)
//				/* Stream<String> */	.map(Hero::getName)
//				/* List<String>   */	.collect(Collectors.toList());
//				/* Set<String>	  */	.collect(Collectors.toSet());
//				/* Map<String, Hero> */	.collect(Collectors.toMap()
//										.collect(Collectors.toMap(
//												Hero::getName,
//												(hero) -> hero
//										))
										.sorted(new Comparator<Hero>() {
											@Override
											public int compare(Hero o1, Hero o2) {
												return o1.getName().compareTo(o2.getName());
											}
										})
										.map(Hero::getName)
										.collect(Collectors.joining(" * "));
		System.out.println(accumulatedHeroes);
	}
}
