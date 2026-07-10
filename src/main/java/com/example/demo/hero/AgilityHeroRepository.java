package com.example.demo.hero;

import com.example.demo.Hero;
import com.example.demo.HeroRepository;

import java.util.ArrayList;
import java.util.Collection;

public class AgilityHeroRepository implements HeroRepository {
    private AgilityHero[] agilityHeroes = new AgilityHero[] {
            new AgilityHero("Slark"),
            new AgilityHero("Power Ranger")
    };

    @Override
    public Hero readHero(String name) {
        for (AgilityHero h : agilityHeroes) {
            if (h.getName().equals(name)) {
                return h;
            }
        }
        return null;
    }
}
