package com.bridgelabz.corejavapractice;
import java.util.Scanner;

public class ReverseNumberFor {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int n = sc.nextInt();

        int reverse = 0;

        for(; n != 0; n /= 10) {
            int digit = n % 10;
            reverse = reverse * 10 + digit;
        }

        System.out.println("Reverse = " + reverse);
    }
}