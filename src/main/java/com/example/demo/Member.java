package com.example.demo;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Member {
    protected int id;
    protected String name;

    public final String toString() {
        return String.format(
                "Member(id=%s, name=%s)",
                id, name
        );
    }
}
