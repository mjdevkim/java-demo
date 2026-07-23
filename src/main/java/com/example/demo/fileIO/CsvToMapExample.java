package com.example.demo.fileIO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class CsvToMapExample {
    public static void main(String[] args) {
        Map<String, Integer> loadedMap = new HashMap<>();

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("stock.csv"))) {
            String line;
            boolean header = true;

            while ((line = bufferedReader.readLine()) != null) {
                if (header) {
                    header = false;
                    continue;
                }

                String[] tokens = line.split(",");
                String key = tokens[0];
                int val = Integer.parseInt(tokens[1]);

                loadedMap.put(key, val);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(loadedMap);
    }
}
