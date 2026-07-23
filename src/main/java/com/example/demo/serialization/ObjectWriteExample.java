package com.example.demo.serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectWriteExample {
    public static void main(String[] args) {
        User user = new User("Alice", 20);

        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("user.ser"))) {
            objectOutputStream.writeObject(user);   // 객체를 파일로 저장
            System.out.println("직렬화 완료: user.ser");
            objectOutputStream.flush();  // 버퍼 강제 출력
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
