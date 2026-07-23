package com.example.demo.serialization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.List;

public class ListReadExample {
    public static void main(String[] args) {
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("users.ser"))) {
            List<User> loadedList = (List<User>) objectInputStream.readObject();
            System.out.println("역직렬화된 리스트: " + loadedList);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
