package com.example.demo.hero;

public class AgilityHeroRepository implements HeroRepository {
    AgilityHero[] agilityHeroRepo = new AgilityHero[]{
            new AgilityHero("Quicksilver"),
            new AgilityHero("Hawk Eye"),
            new AgilityHero("Iron Man")
    };

    @Override
    public Hero readHero(String name) {
        for (int i = 0; i < this.agilityHeroRepo.length; i++) {
            if (agilityHeroRepo[i].getName().equals(name)) {
                return agilityHeroRepo[i];
            }
        }
        return null;
    }
}
