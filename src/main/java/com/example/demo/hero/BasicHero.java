package com.example.demo.hero;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@ToString
@AllArgsConstructor
public abstract class BasicHero implements Hero {
    private String name;

    @Override
    public String getName() {
        return this.name;
    }
}
