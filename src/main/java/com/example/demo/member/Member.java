package com.example.demo.member;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;
import java.util.List;

@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@ToString
public class Member {
    private Long id;
    private String name;
    private int age;
    private String email;

    public static Member from(MemberCreateRequestDto dto) {
        return new Member(
                null,
                dto.getName(),
                dto.getAge(),
                dto.getEmail()
        );
    }
}
