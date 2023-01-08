package com.bridgelabz;

import java.util.Scanner;

public class VowelOrConsonantSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter character =>");
        char c = (scanner.nextLine()).charAt(0);
        char z = Character.toLowerCase(c);
        switch (z) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println(c + " is a vowel");
                break;
            default:
                System.out.println(c + " is a consonant");
        }
    }
}
