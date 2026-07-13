package com.example.demo.hero;

public class StrengthHero extends BasicHero {

    public StrengthHero(String name) {
        super(name);
    }

    @Override
    public void attack() {
        System.out.println("Strength Attack!");
    }

    @Override
    public void ultimate() {
        System.out.println("Ultimate Strength Attack!");
    }
}
