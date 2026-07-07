//package com.example.demo.member;
//
//import java.time.LocalDate;
//
//public class Administrator extends Member{
//
//    private String role;
//    private LocalDate allocatedAt;
//
//    public Administrator(String name, String email, String role) {
//        super(name, email);
//        this.role = role;
//        this.allocatedAt = LocalDate.now();
//    }
//
//    @Override
//    public String toString() {  // override 되는건가?
//        return String.format(
//                "Member(id=%s, name=%s, age=%s, email=%s, role=%s, allocatedAt=%s)",
//                super.id, super.name, super.age, super.email, role, allocatedAt
//        );
//    }
//}
