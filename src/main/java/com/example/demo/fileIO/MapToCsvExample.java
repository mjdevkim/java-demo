package com.example.demo.fileIO;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class MapToCsvExample {
    public static void main(String[] args) {
        Map<String, Integer> stockMap = new HashMap<>();
        stockMap.put("apple", 10);
        stockMap.put("banana",  20);
        stockMap.put("carrot", 30);

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("stock.csv"))) {
            bufferedWriter.write("key,value");  // header
            bufferedWriter.newLine();

            for (Map.Entry<String, Integer> entry : stockMap.entrySet()) {
                String key = entry.getKey();
                int val = entry.getValue();

                bufferedWriter.write(key + "," + val);
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
