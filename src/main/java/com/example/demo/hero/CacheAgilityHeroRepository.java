package com.example.demo.hero;

import org.apache.catalina.webresources.Cache;

public class CacheAgilityHeroRepository extends CacheBasicHeroRepository<AgilityHero> {
    public CacheAgilityHeroRepository(AgilityHero[] heroes) {
        super(new AgilityHeroRepository(heroes));
    }
}
