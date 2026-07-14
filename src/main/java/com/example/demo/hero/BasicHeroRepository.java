package com.example.demo.hero;

import lombok.AllArgsConstructor;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public abstract class BasicHeroRepository<T extends Hero> implements CrudRepository<T> {
    // 데이터베이스라고 가정 : (1) 조회에 드는 시간이 약 1초로 길고 가정 / (2) 데이터베이스는 1회 호출할때마다 1만원 비용이 많이 든다
    private final List<T> heroes = new ArrayList<>();

    public BasicHeroRepository(List<T> heroes) {
        this.heroes.addAll(heroes);
    }

    @Override
    public T findByName(String name) {
        for (T each : this.heroes) {
            if (each.getName().equals(name)) {
                return each;
            }
        }
        return null;
    }

    @Override
    public void create(T hero) {
        T retrieve = findByName(hero.getName());
        if (Objects.nonNull(retrieve)) {
            throw new RuntimeException("똑같은 이름의 영웅이 이미 있습니다! - 받은 영웅 객체의 이름 : " + hero.getName());
        }
        this.heroes.add(retrieve);
    }

    @Override
    public void delete(String name) {
        T retrieve = findByName(name);
        if (Objects.isNull(retrieve)) {
            throw new RuntimeException("지우시려는 이름의 영웅이 기존에 없습니다! - 받은 영웅 객체의 이름 : " + name);
        }
        this.heroes.remove(retrieve);
    }
}
