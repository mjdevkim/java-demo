package com.example.demo;

// CRUD

// Hero DB

// Failfast: 잘못된 상황에서 뭘 하려고 하지 말고 바로 에러를 발생시켜
// Failover: 잘못된 상황에서 수평적인 다른 대안으로 대체 실행해 (90% 성능 -> 90% 성능)
// Fallback: 잘못된 상황에서 수직적인 구린 대안으로 대체 실행해 (90% 성능 -> 10% 성능)

public interface HeroRepository {
    default void createHero(Hero hero) {
        throw new RuntimeException("This is default addHero() - Need to implement");
    }

    default Hero readHero(String name) {
        throw new RuntimeException("This is a default readHero() - Need to implement");
    }

    default void updateHero(Hero hero) {
        throw new RuntimeException("This is default updateHero() - Need to implement");
    }

    default void deleteHero(String name) {
        throw new RuntimeException("This is default delete() - Need to implement");
    }
}
