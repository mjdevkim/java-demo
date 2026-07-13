package com.example.demo.hero;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public abstract class BasicHeroRepository<T extends Hero> implements CrudRepository<T> {
    private T[] heroes;

    @Override
    public void create(T hero) {
        int origHeroesLen = this.heroes.length;

        T[] newHeroes = (T[]) new Hero[origHeroesLen + 1];

        // copy existing heroes
        for (int i = 0; i < origHeroesLen; i++) {
            newHeroes[i] = this.heroes[i];
        }

        // add new hero & replace
        newHeroes[origHeroesLen] = hero;
        this.heroes = newHeroes;
    }

    @Override
    public T read(String name) {
        // 1D scan
        for (int i = 0; i < this.heroes.length; i++) {
            if (this.heroes[i].getName().equals(name)) {
                return this.heroes[i];
            }
        }
        return null;
    }

}
