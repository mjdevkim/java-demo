package com.example.demo.optional;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.ToString;
import lombok.experimental.FieldDefaults;

@RequiredArgsConstructor
@ToString
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
public class Person {
    int id;
    String name;
    int age;
}
