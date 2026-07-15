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
import java.util.stream.Stream;

@SpringBootApplication
public class DemoApplication {

	private final static Map<Integer, Player> PLAYERS = new HashMap<>() {
		{
			// Radiant 진영
			put(1, new Player(1, "Aaron", Side.RADIANT, 7, 12, 2, new AgilityHero("Slark")));
			put(2, new Player(2, "Baron", Side.RADIANT, 2, 1, 6, new StrengthHero("Slardar")));
			put(3, new Player(3, "Caron", Side.RADIANT, 4, 4, 4, new AgilityHero("Weaver")));
			put(4, new Player(4, "Daron", Side.RADIANT, 8, 4, 4, new StrengthHero("Huskar")));
			put(5, new Player(5, "Earon", Side.RADIANT, 1, 4, 4, new AgilityHero("Anti-Mage")));

			// Dire 진영
			put(6, new Player(6, "Faron", Side.DIRE, 0, 5, 9, new StrengthHero("Tiny")));
            put(7, new Player(7, "Garon", Side.DIRE, 7, 4, 2, new StrengthHero("Dragon Knight")));
            put(8, new Player(8, "Haron", Side.DIRE, 4, 3, 1, new StrengthHero("Night Stalker")));
            put(9, new Player(9, "Iaron", Side.DIRE, 8, 2, 2, new AgilityHero("Phantom Lancer")));
            put(10, new Player(10, "Jaron", Side.DIRE, 1, 8, 7, new AgilityHero("Drow Ranger")));

		}
	};

	public static void main(String[] args) {
		/**
		 * 최종연산자
		 */
		// forEach()
		List<Player> playerList = new ArrayList<>(PLAYERS.values());

		System.out.println("--- Stream.forEach ---");
		Stream<String> intermediate = playerList.stream()
				.peek(player -> System.out.println(">> 첫번째 중간 연산자가 실행됩니다 <<"))
				.filter((player) -> { return player.getSide().equals(Side.RADIANT); })	// 첫번째 중간 연산
				.peek(player -> System.out.println(">> 두번째 중간 연산자가 실행됩니다 <<"))
				.filter((player) -> { return player.getKill() >= 5; })
				.peek(player -> System.out.println(">> 세번째 중간 연산자가 실행되기 전: %s << \n"))
				.map(Player::getPickedHero)
				.map(Hero::getName);

		System.out.println("--- 중간 연산자들 적용 완료 / 이제 최종 연산자를 통해 실행 ---");
		intermediate
				.forEach(new Consumer<String>() {
					@Override
					public void accept(String heroName) {
						System.out.println(heroName + "\n\n");
					}
				});
	}
}