package com.bridgelabz.corejavapractice;

import java.util.Scanner;

public class DecimalToBinary {

    public static String toBinary(int n) {

        String binary = Integer.toBinaryString(n);

        while (binary.length() < 32) {
            binary = "0" + binary;
        }

        return binary;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        System.out.println("Binary Representation = " + toBinary(n));
    }
}