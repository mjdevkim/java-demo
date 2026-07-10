package com.example.demo.hero;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public abstract class BasicHeroRepository implements HeroRepository {
    private Hero[] heroes = new Hero[]{};

    @Override
    public Hero readHero(String name) {
        for (int i = 0; i < this.heroes.length; i++) {
            if (this.heroes[i].getName().equals(name)) {
                return this.heroes[i];
            }
        }
        return null;
    }
}
