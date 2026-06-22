package com.bridgelabz.corejavapractice;

import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;

public class CouponNumbers {

    // Generate random coupon
    public static int generateCoupon(int n) {
        Random random = new Random();
        return random.nextInt(n);
    }

    // Process distinct coupons
    public static int collectCoupons(int n) {

        HashSet<Integer> set = new HashSet<>();
        int count = 0;

        while (set.size() < n) {

            int coupon = generateCoupon(n);

            set.add(coupon);

            count++;
        }

        return count;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of distinct coupons: ");
        int n = sc.nextInt();

        int randomNumbersGenerated = collectCoupons(n);

        System.out.println("Total random numbers needed = "
                + randomNumbersGenerated);
    }
}