package com.bridgelabz;

import java.util.Scanner;

public class PalindromeNumberForLoop {
    public static void main(String[] args) {
        String Original, Reversed = "";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Number to check it is Palindrome");
        Original = scanner.nextLine();
        int length = Original.length();
        for (int i = length - 1; i >= 0; i--)
            Reversed = Reversed + Original.charAt(i);
        if (Original.equals(Reversed))
            System.out.println("Number is Palindrome");
        else
            System.out.println("Number isn't Palindrome");
    }
}
