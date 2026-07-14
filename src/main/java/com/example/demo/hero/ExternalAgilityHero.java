package com.example.demo.hero;

// Adapter
public class ExternalAgilityHero extends AgilityHero {
    // AgilityHero 타입으로 변장 (Adapter Pattern)
    // ExternalHero 외부로부터 가져온 용병 영웅
    private final ExternalHero original;

    public ExternalAgilityHero(ExternalHero original) {
        super(original.getSurName() + " " + original.getGivenName());
        this.original = original;
    }

    @Override
    public void attack() {
        this.original.leftHook();
        this.original.rightHook();
    }

    @Override
    public void ultimate() {
        this.original.useItem();
        this.original.leftHook();
        this.original.rightHook();
    }
}
