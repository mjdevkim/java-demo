package com.example.demo.fileIO;

import java.io.*;

public class BufferedReaderWriterExample {
    public static void main(String[] args) throws IOException {
        // 맨 처음 실행
//        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("example.txt"))) {
//            bufferedWriter.write("First line");
//            bufferedWriter.newLine();
//            bufferedWriter.write("Second line");
//            bufferedWriter.newLine();
//            bufferedWriter.write("Third line");
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        // BufferedReader로 example.txt의 텍스트를 한줄씩 읽는다
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("example.txt"))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // BufferedWriter로 output.txt에 텍스트를 한줄씩 쓴다
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("output.txt"))) {
            bufferedWriter.write("Hello File I/O");
            bufferedWriter.newLine();
            bufferedWriter.write("Using BufferedWriter for better performance");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
