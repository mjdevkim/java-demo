package com.example.demo;


public class PaymentPrice extends OriginalPrice {
    private final static double TAX_RATE = 0.1;   // % of tax applied to product
    private int deliveryPrice;  // delivery fee to deliver product

    public PaymentPrice(String name, int price, int deliveryPrice) {
        super(name, price);
        this.deliveryPrice = deliveryPrice;
    }

    @Override
    public void display() {
        System.out.printf(
                "Product: %s\nProduct Price: $%d\nTax: %f%%\nDelivery: $%d\nTotal Price: $%f\n",
                super.name, super.price, TAX_RATE, this.deliveryPrice,
                super.price * (1 + TAX_RATE) + this.deliveryPrice
        );
    }

    public void display(String name) {
        System.out.println("Product: " + name);
    }
}
