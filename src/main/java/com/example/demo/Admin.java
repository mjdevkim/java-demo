package com.example.demo;

public class Admin extends Member{
    private String role;

    public Admin(int id, String name, String role) {
        super(id, name);
        this.role = role;
    }

//    @Override
//    public String toString() {
//        return String.format(
//                "Member(id=%s, name=%s, role=%s",
//                id, name, role
//        );
//    }
}
