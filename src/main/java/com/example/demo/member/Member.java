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
    private List<String> hobbies;
    private LocalDate createdAt = LocalDate.now();

    @Builder
    public Member(String name, String email, int age, @Singular List<String> hobbies) {
        this.name = name;
        this.email = email;
        this.age = age;
        this.hobbies = hobbies;
    }

    public static class MemberBuilder {
        public MemberBuilder age(int age) {
            if (age < 0 || age > 100) {
                throw new IllegalArgumentException("age는 0~100까지만 허용");
            }
            this.age = age;
            return this;
        }
    }
}
