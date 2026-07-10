package com.example.demo.hero;

public interface HeroRepository {
    // CRUD
    default void createHero() {
        throw new RuntimeException("Implement createHero()");
    }
    default Hero readHero(String name) {
        throw new RuntimeException("Implement readHero()");
    }
    default Hero updateHero(Hero hero) {
        throw new RuntimeException("Implement updateHero()");
    }
    default void deleteHero(String name) {
        throw new RuntimeException("Implement deleteHero()");
    }
}
