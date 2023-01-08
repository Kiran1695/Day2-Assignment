package com.bridgelabz;

import java.util.Scanner;

public class SumOfNaturalNumbersWhileLoop {
    public static void main(String[] args) {
        int num, i, sum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sum from =>");
        i = scanner.nextInt();
        System.out.println("Sum up to =>");
        num = scanner.nextInt();
        while (i <= num) {
            sum = sum + i;
            i++;
        }
        System.out.println("Sum Of Natural Number= " + sum);
    }
}
