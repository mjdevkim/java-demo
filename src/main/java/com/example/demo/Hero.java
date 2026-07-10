package com.example.demo;

// Abstract = interface
public interface Hero extends HeroAttack, HeroUltimate {
    // 사용에 대한 정의
    void attack(); // 일반 공격
    void ultimate();
}
