package com.example.demo.ramen;

public class MakingShinRamen extends MakingRamen {
    @Override
    protected String water() {
        return "tap water";
    }

    @Override
    protected String soup() {
        return "shin ramen soup";
    }

    @Override
    protected String noodle() {
        return "thin noodles";
    }
}
