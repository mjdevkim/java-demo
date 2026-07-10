package com.example.demo.hero;

import com.example.demo.Hero;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class StrongHero implements Hero {
    private String name;

    @Override
    public void attack() {
        System.out.println("Strong Attack!");
    }

    @Override
    public void ultimate() {
        System.out.println("Strong ultimate attack!");
    }

    public void additional() {
        System.out.println("Taunt");
    }
}
