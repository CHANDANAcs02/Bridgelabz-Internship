package com.bridgelabz.corejavapractice;

import java.util.Scanner;

public class Binary {

    public static int swapNibbles(int n) {

        return ((n & 0x0F) << 4 | (n & 0xF0) >> 4);
    }

    public static boolean isPowerOfTwo(int n) {

        return n > 0 && (n & (n - 1)) == 0;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        System.out.println("Binary Representation : "
                + String.format("%8s", Integer.toBinaryString(n))
                        .replace(' ', '0'));

        int swapped = swapNibbles(n);

        System.out.println("After Swapping Nibbles : "
                + String.format("%8s", Integer.toBinaryString(swapped))
                        .replace(' ', '0'));

        System.out.println("Decimal Value After Swap = " + swapped);

        if (isPowerOfTwo(swapped))
            System.out.println(swapped + " is a Power of 2");
        else
            System.out.println(swapped + " is not a Power of 2");
    }
}