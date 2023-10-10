package com.eb.chapter;

public class Car {
    private String brand = "ferrari";
    public int price = 3000000;
    public String color = "red";

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
