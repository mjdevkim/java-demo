package com.example.demo.member;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;
import java.util.List;

@ToString
public class Member {
    private Long id;
    private String name;
    private int age;
    private String email;
    private List<String> favorites;
    private LocalDate createdAt;

    @Builder
    public Member(String name, String email) { // Builder는 name과 email만 받게 설정하는 것
        this.name = name;
        this.email = email;
    }
}

