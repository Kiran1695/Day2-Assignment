package com.bridgelabz;

public class ReverseIntegerWhileLoop {
    public static void main(String[] args) {
        int a = 231, rev = 0;
        System.out.println("Original=> " + a);
        while (a != 0) {
            int digit = a % 10;
            rev = rev * 10 + digit;
            a /= 10;
        }
        System.out.println("Reverse=> " + rev);
    }
}
