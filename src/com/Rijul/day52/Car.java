package com.Rijul.day52;

public class Car {
    public String make;
    public int year;
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.make = "Mahindra";
        myCar.year = 2020;
        System.out.println(myCar.make);
        System.out.println( myCar.year);
    }
}
