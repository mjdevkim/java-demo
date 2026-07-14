package com.example.demo.hero;

import lombok.AllArgsConstructor;

import java.util.*;

public abstract class BasicHeroRepository<V extends Hero> implements CrudRepository<String, V> {
    // 데이터베이스라고 가정 : (1) 조회에 드는 시간이 약 1초로 길고 가정 / (2) 데이터베이스는 1회 호출할때마다 1만원 비용이 많이 든다
    private final Map<String, V> heroes = new HashMap<>();

    public BasicHeroRepository(List<V> heroes) {
        for (V hero : heroes) {
            this.heroes.put(hero.getName(), hero);
        }
    }

    @Override
    public V findByKey(String name) {
        if (this.heroes.containsKey(name)) {
            return this.heroes.get(name);
        }
        return null;
    }

    @Override
    public void create(V hero) {
        V retrieve = this.findByKey(hero.getName());
        if (Objects.nonNull(retrieve)) {
            throw new RuntimeException("똑같은 이름의 영웅이 이미 있습니다! - 받은 영웅 객체의 이름 : " + hero.getName());
        }
        this.heroes.put(hero.getName(), hero);
    }

    @Override
    public void delete(String name) {
        V retrieve = findByKey(name);
        if (Objects.isNull(retrieve)) {
            throw new RuntimeException("지우시려는 이름의 영웅이 기존에 없습니다! - 받은 영웅 객체의 이름 : " + name);
        }
        this.heroes.remove(name);
    }
}
