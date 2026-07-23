package com.example.demo.fileIO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CsvToListProductExample {
    // 정적 Inner 클래스 - Product 클래스 정의
    public static class Product {
        // columns (properties)
        private int id;
        private String name;
        private int price;

        public Product(int id, String name, int price) {
            this.id = id;
            this.name = name;
            this.price = price;
        }

        @Override
        public String toString() {
            return "Product{" +
                    "id=" + id +
                    ", name=" + name +
                    ", price=" + price +
                    "}";
        }
    }

    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("products.csv"))) {
            String line;
            boolean isHeader = true;

            while ((line = bufferedReader.readLine()) != null) {
                if (isHeader) { // 첫번째 줄은 header이다
                    isHeader = false;
                    continue;
                }

                // csv 파싱 -> >>콤마<<로 분리
                String[] tokens = line.split(",");
                int id = Integer.parseInt(tokens[0]);
                String name = tokens[1];
                int price = Integer.parseInt(tokens[2]);

                products.add(new Product(id, name, price));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("CSV로부터 로드된 Product List: " + products);
    }
}
