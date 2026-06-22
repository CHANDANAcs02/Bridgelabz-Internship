package com.bridgelabz.corejavapractice;

import java.util.Scanner;

public class SquareRoot {

    public static double sqrt(double c) {

        double epsilon = 1e-15;
        double t = c;

        while (Math.abs(t - c / t) > epsilon * t) {

            t = (c / t + t) / 2.0;
        }

        return t;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        double c = sc.nextDouble();

        System.out.println("Square Root = " + sqrt(c));
    }
}