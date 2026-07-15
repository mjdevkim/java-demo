package com.example.demo.hero;

import java.util.List;

public class AgilityHeroRepository extends BasicHeroRepository<AgilityHero> {
    public AgilityHeroRepository(AgilityHero[] heroes) {
        super(List.of(heroes));
    }
}
