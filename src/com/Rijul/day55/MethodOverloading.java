package com.Rijul.day55;

class Person {
    void greet() {
        System.out.println("Hello!");
    }

    void greet(String name) {
        System.out.println("Hello, " + name + "!");
    }

    void greet(String name, int age) {
        System.out.println("Hello, " + name + "! You are " + age + " years old.");
    }
}
public class MethodOverloading{
    public static void main(String[] args) {
        Person p = new Person();
        p.greet();
        p.greet("Rijul");
        p.greet("Rijul", 19);
    }
}
