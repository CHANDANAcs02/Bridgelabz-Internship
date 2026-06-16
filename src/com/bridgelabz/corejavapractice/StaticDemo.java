package com.bridgelabz.corejavapractice;

public class StaticDemo {

    static int count = 100;

    static {

        System.out.println("Static block executed");

    }

    static void display() {

        System.out.println("Static method called");
        System.out.println("Count = " + count);

    }

    public static void main(String[] args) {

        display();

    }
}