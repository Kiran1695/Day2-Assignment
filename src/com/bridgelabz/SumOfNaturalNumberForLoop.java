package com.bridgelabz;

public class SumOfNaturalNumberForLoop {
    public static void main(String[] args) {
        int a, num = 10, sum = 0;
        for (a = 1; a <= num; ++a) {
            sum = sum + a;
        }
        System.out.println("Sum Of First Ten Natural Number is=> " + sum);
    }
}
