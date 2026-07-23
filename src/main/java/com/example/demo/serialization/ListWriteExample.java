package com.example.demo.serialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class ListWriteExample {
    public static void main(String[] args) {
        List<User> userList = new ArrayList<>();
        userList.add(new User("Kim", 25));
        userList.add(new User("Lee", 26));
        userList.add(new User("Park", 27));
        userList.add(new User("Choi", 28));

        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("users.ser"))) {
            objectOutputStream.writeObject(userList);   // List 자체를 통째로 직렬화
            System.out.println("리스트 직렬화 완료: users.ser");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
