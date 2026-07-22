package com.example.demo;

import com.example.demo.coupang.*;
import com.example.demo.hero.*;
import com.example.demo.optional.Person;
import com.example.demo.ramen.MakingRamen;
import com.example.demo.ramen.MakingShinRamen;
import com.example.demo.repeater.Repeatee;
import com.example.demo.repeater.Repeater;
import com.example.demo.weeklyPaper.*;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.*;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		List<Gamer> gamerList = new ArrayList<>();
		gamerList.add(new Gamer("jh"));
		gamerList.add(new Gamer("mj"));
		gamerList.add(new Gamer("hs"));
		gamerList.add(new Gamer("sh"));
		gamerList.add(new Gamer("jh2"));

		// 게임스 > 게이머
		Games gameOne  = new Games(gamerList);
		Games gameTwo = new Games(gamerList );

		List<Games> gamesList = new ArrayList<>();
		gamesList.add(gameOne);
		gamesList.add(gameTwo);



		//Map
		List<String> nameList = gamerList.stream()
				.map(Gamer::getName)
				.toList();

		System.out.println("===== 일반 맵 사용 =====");
		System.out.println(nameList);



		//flatMap
		Stream<Gamer> stream = gamesList.stream()
				.flatMap(games -> games.getGamerList().stream());

		List<Gamer> flatMapList = stream.toList();

		System.out.println("===== 플랫맵 사용 =====");
		System.out.println(flatMapList);

	}
}
