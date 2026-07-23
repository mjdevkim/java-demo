package com.example.demo.fileIO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TextFileToListExample {
    public static void main(String[] args) {
        List<String> loadedItems = new ArrayList<>();

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("items.txt"))) {
            String line;

            while ((line = bufferedReader.readLine()) != null) {    // 마지막 줄까지
                if (!line.trim().isEmpty()) {   // .trim() <- 공백 제거?
                    // 주석 무시
                    if (!line.startsWith("#")) {
                        loadedItems.add(line);
                    }
                }

                // 잘못된 데이터인지 체크 -> 메서드 직접 구현
                // if(!isValidData(line)) continue;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("로드된 리스트: " + loadedItems);
    }
}
