package com.example.demo.member;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;
import java.util.List;

@Builder
@ToString
public class Member {
    private Long id;
    private String name;

    private int age;

    @Builder.Default
    private String email = "default@example.com";

    @Singular
    private List<String> favorites;

    private LocalDate createdAt;

    public static class MemberBuilder {
        public MemberBuilder age(int age) {
            if (age >= 30) {
                throw new IllegalArgumentException("30세 이상은 입력할 수 없습니다.");
            }
            this.age = age; // Builder.Default가 있으면 안됨
            return this;
        }
    }

}
