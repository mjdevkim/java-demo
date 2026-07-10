package com.example.demo.hero;

import com.example.demo.Hero;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class IntelligentHero implements Hero {
    private String name;

    @Override
    public void attack() {
        System.out.println("Intelligent Attack!");
    }

    @Override
    public void ultimate() {
        System.out.println("Intelligent ultimate attack!");
    }
}
