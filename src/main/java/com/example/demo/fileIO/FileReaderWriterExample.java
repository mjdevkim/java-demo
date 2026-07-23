package com.example.demo.fileIO;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderWriterExample {
    public static void main(String[] args) throws IOException {
//        System.out.println(System.getProperty("user.dir"));

        // FileReader로 텍스트 파일을 한 글자씩 >>읽기<<
        try (FileReader fileReader = new FileReader("example.txt")) {   // 이 괄호 안에 있는 리소스는 try 블록이 끝나면 자동으로 .close() 된다
            int data; // 한 문자의 ascii 값

            while ((data = fileReader.read()) != -1) {  // 파일 끝에 도달하면 -1 반환
                System.out.println((char) data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // FileWriter로 텍스트 파일에 한 글자씩 >>쓰기<<
        try (FileWriter fileWriter = new FileWriter("output.txt")) {
            String content = "Hello, File I/O"; // 파일에 쓸 값
            for (char c : content.toCharArray()) {
                fileWriter.write((int) c);  // 한 글자씩 디스크에 쓰기
            }

            fileWriter.flush(); // ??   // 버퍼의 내용을 강제로 디스크에 쓰기
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
