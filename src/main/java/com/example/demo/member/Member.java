package com.example.demo.member;

import lombok.*;

// @ToString(exclude = "email") : 클래스 단위의 ToString에서 해당 필드를 제외하고 싶을 때
@ToString(of = { "name", "email" }) // 클래스 단위의 ToString에서 이 필드들만 표기하고 싶을 때
// @ToString(callSuper = true) // 부모클래스의 필드들도 ToString에 표기하고 싶을 때
@Getter
@AllArgsConstructor(access = AccessLevel.PUBLIC)
public class Member {
    private Integer id;
    // @ToString.Exclude: 클래스 단위의 ToString에서 해당 필드를 제외하고 싶을 때
    private String name;
    @Setter(AccessLevel.PRIVATE)
    private int age;
    @Setter
    private String email;
}
