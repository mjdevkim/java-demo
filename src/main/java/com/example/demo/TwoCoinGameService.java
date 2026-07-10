package com.example.demo;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class TwoCoinGameService implements IGameService {
    private final Hero hero;

    @Override
    public void play() {
        System.out.println(" - Game Start - ");
        this.hero.attack();
        this.hero.ultimate();
        System.out.println(" - Game Continue? - ");
        this.hero.attack();
        this.hero.ultimate();
        System.out.println(" - Game End - ");
    }
}
