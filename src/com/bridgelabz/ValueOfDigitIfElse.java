package com.bridgelabz;

import java.util.Scanner;

public class ValueOfDigitIfElse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int thousand = 0;
        int hundred = 0;
        int ten = 0;
        int one = 0;
        System.out.println("Enter 4 Digit Numbers");
        int number = scanner.nextInt();
        if (number <= 9999 && number > 999) {
            thousand = number / 1000;
            System.out.println("Thousand place digit => " + thousand);
            hundred = (number / 100) % 10;
            System.out.println("Hundred place digit => " + hundred);
            ten = (number / 10) % 10;
            System.out.println("Ten place digit => " + ten);
            one = (number % 10);
            System.out.println("One place digit => " + one);
        } else {
            if (number > 9999)
                System.out.println("Error! Number more than digits");
            if (number < 1000)
                System.out.println("Error! Number less than 4 digits");
        }
    }
}
