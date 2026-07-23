package com.example.demo.serialization;

import java.io.Serializable;

public class User implements Serializable {
    // 직렬화 버전 UID
    // 클래스 구조가 변경회어도 호황성을 유지할 것을 명시
    private static final long serialVersionUID = 1L;

    private String name;
    private int age;

    // "transient" 키워드를 사용하면 직렬화에서 제외된다
//    private transient String password;  // password는 직렬화 시키지 않음


    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{name='" + name + '\'' + ", age=" + age + '}';
    }
}
