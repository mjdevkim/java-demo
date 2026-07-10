package com.example.demo.hero;

import com.example.demo.Hero;
import lombok.*;

// Concrete = Class implements

@AllArgsConstructor
public class AgilityHero implements Hero {
    @Getter
    private String name;

    @Override
    public void attack() {
        System.out.println("Agility attack");
    }

    @Override
    public void ultimate() {
        System.out.println("Agility ultimate attack!");
    }
}
