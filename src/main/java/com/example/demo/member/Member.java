package com.example.demo.member;


public class Member {
    protected Integer id;
    protected String name;
    protected int age;
    protected String email;

    public Member(String name, String email) {
        // this.id = null; // Reference Type 이기 때문에 값을 설정하지 않으면 NULL 이 들어간다.
        this.name = name;
        // this.age = 0;   // Primitive Type 이기 때문에 값을 설정하지 않으면 기본값 0 이 들어간다.
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return String.format("Member(id=%s, name=%s, age=%s, email=%s)", id, name, age, email);
    }
}
