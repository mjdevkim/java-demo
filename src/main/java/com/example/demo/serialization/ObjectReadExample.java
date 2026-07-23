package com.example.demo.serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectReadExample {
    public static void main(String[] args) {
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("user.ser"))) {
            User loadedUser = (User) objectInputStream.readObject();    // (User) cast를 하는 이유: readObject는 Object 타입을 반환한다
            System.out.println("역직렬화(deserialization)된 객체: " + loadedUser);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
