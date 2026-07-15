package com.example.demo.hero;

import java.util.List;

public class StrengthHeroRepository extends BasicHeroRepository<StrengthHero> {
    public StrengthHeroRepository(StrengthHero[] heroes) {
        super(List.of(heroes));
    }
}
