package com.example.demo.hero;

public class SuperAgilityHero extends AgilityHero {
    private final AgilityHero actual;

    public SuperAgilityHero(AgilityHero actual) {
        super(actual.getName());
        this.actual = actual;
    }

    @Override
    public void attack() {
        // pre
        this.actual.attack();
        this.actual.attack();
        // post
    }

    @Override
    public void ultimate() {
        // pre
        this.actual.ultimate();
        this.actual.ultimate();
        this.actual.ultimate();
        // post
    }

}
