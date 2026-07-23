package com.example.demo.fileIO;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ListToTextFileExample {
    public static void main(String[] args) {
        List<String> items = new ArrayList<>();
        items.add("Apple");
        items.add("Banana");
        items.add("Cherry");

        // List를 파일로 저장
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("items.txt"))) {
            for (String item : items) {
                bufferedWriter.write(item);
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
