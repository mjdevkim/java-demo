package com.example.demo.hero;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class ExternalHero {
    private String surName; // 성
    private String givenName;   // 이름

    public void leftHook() {
        System.out.println("Attack: Left Hook");
    }

    public void rightHook() {
        System.out.println("Attack: Right Hook");
    }

    public void useItem() {
        System.out.println("Item: Static Thunder");
    }
}
