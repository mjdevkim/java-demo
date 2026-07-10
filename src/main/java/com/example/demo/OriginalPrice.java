package com.example.demo;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class OriginalPrice {
    protected String name;    // product name
    protected int price; // product price

    public void display() { // print product price
        System.out.printf("Price of: %s is %d.\n", this.name, this.price);
    }
}
