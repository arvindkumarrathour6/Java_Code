package Recursion;

import java.util.Scanner;

import java.util.Scanner;

import java.util.Scanner;

public class ArmstrongRecursion {

    static int power(int rem, int digit) {
        if (digit == 0) {
            return 1;
        }
        return rem * power(rem, digit - 1);
    }

    static int armstrong(int n, int digit) {
        if (n == 0) {
            return 0;
        }
        int rem = n % 10;
        return power(rem, digit) + armstrong(n / 10, digit);
    }

    static int countDigits(int n) {
        if (n == 0) {
            return 0;
        }
        return 1 + countDigits(n / 10);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int n = sc.nextInt();

        int digit = countDigits(n);
        System.out.println(digit);
        int arm = armstrong(n, digit);
        System.out.println(arm);
        if (n == arm) {
            System.out.println("It is an Armstrong Number");
        } else {
            System.out.println("It is not an Armstrong Number");
        }
    }
}
