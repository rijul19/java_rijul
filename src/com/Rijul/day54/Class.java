package com.Rijul.day54;

class Car{
    String brand;
    String color;
    String engine;
    int price;
    int seats;

    public Car(String brand, String color, String engine, int price, int seats){
        this.brand=brand;
        this.color=color;
        this.engine=engine;
        this.price=price;
        this.seats=seats;
    }
}
public class Class {
    public static void main(String[] args) {
        Car c1 = new  Car("BMW", "Red", "Petrol", 2500000, 5);

        System.out.println(c1.brand);
    }
}
