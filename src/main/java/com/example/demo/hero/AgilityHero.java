package com.example.demo.hero;

import lombok.AllArgsConstructor;
import lombok.Getter;


@AllArgsConstructor
public class AgilityHero implements Hero {
    @Getter
    private String name;

    @Override
    public void attack() {
        System.out.println("Agility Attack!");
    }

    @Override
    public void ultimate() {
        System.out.println("Ultimate Agility Attack!");
    }
}
