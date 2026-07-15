package com.example.demo.student;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class Student {
    private String name;
    private int studentId;
    private int age;

    public String toString() {
        return String.format("Student{name='%s', studentId='%d', age=%d}",
                this.name,
                this.studentId,
                this.age
        );
    }
}
