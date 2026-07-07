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

    @Builder.Default
    private int age = 18;

    @Builder.Default
    private String email = "default@example.com";

    @Singular
    private List<String> favorites;

    private LocalDate createdAt;

}

