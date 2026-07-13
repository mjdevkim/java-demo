package com.example.demo.ramen;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public abstract class MakingRamen {
    public final void boiling() {
        System.out.println("Start cooking ramen");
        System.out.println("Boil water: " + this.water());
        System.out.println("Add soup: " + this.soup());
        System.out.println("Add noodle: " + this.noodle());
        System.out.println("Ready to eat");
    }

    protected abstract String water();
    protected abstract String soup();
    protected abstract String noodle();
}
