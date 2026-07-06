package com.example.demo.array;

import com.example.demo.member.Member;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class ArrayDemo {
    public static void main(String[] args) {
        String[] stringArray = new String[]{"1", "2", "3"};
        System.out.println(stringArray.length);

        Integer[] intArray = new Integer[3]; // 길이 기반 Array
        Integer[] intArray2 = new Integer[]{1, 2, 3}; // 값 기반 Array 선언
        System.out.println(intArray.length);

        System.out.println(stringArray);
        System.out.println(intArray);

        int[] scores = {88, 92,76};
        System.out.println(scores.length); // 3
        System.out.println(Arrays.toString(scores)); // [88, 92, 76]
        Arrays.sort(scores);
        System.out.println(Arrays.toString(scores)); // [76, 88, 92]

        Member[] members = {
                new Member("Arthur", ""),
                new Member("Barney", ""),
                new Member("Lisa", ""),
                new Member("Maggie", "")
        };

        String[][] fruits = {
                {"Apple", "Grapes", "Orange"},
                {"Mango", "Pineapple", "Banana"},
                {"Strawberry", "Blueberry", "Raspberry"}
        };

        for (int i = 0; i < fruits.length; i++) {
            for (int j = 0; j < fruits[i].length; j++) {
                System.out.println(fruits[i][j]);
            }
            System.out.println();
        }

    }
}
