package com.example.demo.member;

import lombok.*;
import lombok.experimental.FieldDefaults;

// @ToString(exclude = "email") : 클래스 단위의 ToString에서 해당 필드를 제외하고 싶을 때
@ToString(of = { "name", "email" }) // 클래스 단위의 ToString에서 이 필드들만 표기하고 싶을 때
// @ToString(callSuper = true) // 부모클래스의 필드들도 ToString에 표기하고 싶을 때
@Getter
@AllArgsConstructor(access = AccessLevel.PUBLIC)
// @EqualsAndHashCode
// @EqualsAndHashCode(of = {"id", "name"}) // 비교에 "쓸" 필드
// @EqualsAndHashCode(exclude = {"email"}) // 비교에 "제외할" 필드
// @EqualsAndHashCode(callSuper = true) // 상속한 클래스 필드 포함하여 동등성 판단
@FieldDefaults(makeFinal = false, level = AccessLevel.PRIVATE)
public class Member {
    Integer id;
    // @ToString.Exclude: 클래스 단위의 ToString에서 해당 필드를 제외하고 싶을 때
    String name;
    @Setter(AccessLevel.PUBLIC)
    int age;
    @Setter
    String email;
}
