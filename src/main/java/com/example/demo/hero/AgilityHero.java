package com.example.demo.hero;

import com.example.demo.Hero;

// Concrete = Class implements
public class AgilityHero implements Hero {

    @Override
    public void attack() {
        System.out.println("Agility attack");
    }

    @Override
    public void ultimate() {
        System.out.println("Agility ultimate attack!");
    }
}
