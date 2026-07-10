package com.example.demo.hero;

public class OneCoinGameService implements IGameService {

    @Override
    public void play(Hero hero) {
        System.out.println("---Start Game---");
        hero.attack();
        hero.ultimate();
        System.out.println("---Game Over---");
    }
}
