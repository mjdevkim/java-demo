package com.example.demo.hero;

public class TwoCoinGameService implements IGameService{

    @Override
    public void play(Hero hero) {
        System.out.printf("Player '%s' has started the game%n", hero.getName());
        System.out.println("---Start Game---");
        hero.attack();
        hero.ultimate();
        System.out.println("---Continue Game---");
        hero.ultimate();
        hero.attack();
        System.out.println("---Game Over---");
    }
}
