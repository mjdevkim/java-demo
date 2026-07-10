package com.example.demo.hero;

import lombok.AllArgsConstructor;
import lombok.Getter;

public class AgilityHero extends BasicHero {

    public AgilityHero(String name) {
        super(name);
    }

    @Override
    public void attack() {
        System.out.println("Agility Attack!");
    }

    @Override
    public void ultimate() {
        System.out.println("Ultimate Agility Attack!");
    }
}
