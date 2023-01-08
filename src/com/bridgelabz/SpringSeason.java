package com.bridgelabz;

import java.util.Scanner;

public class SpringSeason {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Month =>");
        int month = scanner.nextInt();
        System.out.println("Enter Date =>");
        int date = scanner.nextInt();
        if (date <= 20) {
            for (int i = 1; i <= date; i++) {
                if (month >= 3 && month <= 6) {
                    System.out.println("True");
                    break;
                } else {
                    System.out.println("False");
                    break;
                }
            }
        } else
            System.out.println("False =>");

    }
}
