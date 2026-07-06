package com.example.demo.copy;

import com.example.demo.member.Member;

import java.util.Arrays;

public class DeepShallowCopy {

    static class Member{
        String name;
        String email;

        public Member(String name, String email) {
            this.name = name;
            this.email = email;
        }
    }

    public static void main(String[] args) {
        // 기본형 타입은 복사 구별이 없음.

        // Shallow copy - Object
        Member copier = new Member("Leanne", "leanne@email.com");
        Member copiee = copier;

        copier.name = "Not Leanne";
        System.out.println(copier.name);    // Not Leanne
        System.out.println(copiee.name + "\n");    // Not Leanne


        // Deep copy - Object
        Member copier2 = new Member("Minjae", "minjae@email.com");
        Member copiee2 = new Member(copier2.name, copier2.email);

        copier2.name = "Not Minjae";
        System.out.println(copier2.name);    // Not Minjae
        System.out.println(copiee2.name);    // Minjae


        // Shallow copy - Array
        String[] fruits = {"Apple", "Banana", "Orange"};
        String[] fruitsCaps = fruits;

        fruits[0] = "APPLE";
        System.out.println(fruits[0]);
        System.out.println(fruitsCaps[0]);


        // Deep copy - Array 1 - 새 객체를 만들어 값을 따로 복사하였다.
        String[] fruits2 = {"Apple", "Banana", "Orange"};
        String[] fruitsCaps2 = new String[fruits2.length];
        for (int i = 0; i < fruits2.length; i++) {
            fruitsCaps2[i] = fruits2[i];
        }
        fruits2[0] = "APPLE";
        System.out.println(fruits2[0]);
        System.out.println(fruitsCaps2[0]);

        // Deep copy - Array 2 - Arrays.copyOf()
        String[] fruits3 = {"Apple", "Banana", "Orange"};
        String[] fruitsCaps3 = Arrays.copyOf(fruits3, fruits3.length);
        fruits3[0] = "APPLE";
        System.out.println(fruits3[0]);
        System.out.println(fruitsCaps3[0]);

        // Deep copy - Array 3 - System.arraycopy()
        String[] fruits4 = {"Apple", "Banana", "Orange"};
        String[] fruitsCaps4 = new String[fruits4.length];
        System.arraycopy(fruits4, 0, fruitsCaps4, 0, fruits4.length);
        fruits4[0] = "APPLE";
        System.out.println(fruits4[0]);
        System.out.println(fruitsCaps4[0]);

    }


}
