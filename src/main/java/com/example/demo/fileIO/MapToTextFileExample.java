package com.example.demo.fileIO;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class MapToTextFileExample {
    public static void main(String[] args) {
        Map<String, Integer> inventoryMap = new HashMap<>();
        inventoryMap.put("apple", 10);
        inventoryMap.put("banana" , 20);
        inventoryMap.put("cherry", 30);

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("stock.txt"))) {
            for (Map.Entry<String, Integer> entry : inventoryMap.entrySet()) {
                bufferedWriter.write(entry.getKey() + "  :  " + entry.getValue());
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
