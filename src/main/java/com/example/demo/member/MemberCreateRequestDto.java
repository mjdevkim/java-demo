package com.example.demo.member;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@AllArgsConstructor
@ToString
public class MemberCreateRequestDto {
    private String name;
    private String email;
    private int age;
}
