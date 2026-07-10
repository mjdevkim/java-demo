package com.example.demo.hero;

import com.example.demo.Hero;

public class IntelligentHero implements Hero {
    @Override
    public void attack() {
        System.out.println("Intelligent Attack!");
    }

    @Override
    public void ultimate() {
        System.out.println("Intelligent ultimate attack!");
    }
}
