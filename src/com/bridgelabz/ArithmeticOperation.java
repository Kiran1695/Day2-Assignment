package com.bridgelabz;

public class ArithmeticOperation {
    public static void main(String[] args) {
        int a = 50;
        int b = 20;
        int c = 10;
        int result1 = a + b * c;
        System.out.println("result1: " + result1);
        int result2 = c + a / b;
        System.out.println("result2: " + result2);
        int result3 = a % b + c;
        System.out.println("result3: " + result3);
        int result4 = a * b + c;
        System.out.println("result4: " + result4);
        System.out.println("\n");
        if ((result1 > result2) && (result1 > result3) && (result1 > result4)) {
            System.out.println("result1 is greater");
        } else if ((result2 > result3) && (result2 > result4)) {
            System.out.println("result2 is greater");
        } else if (result3 > result4) {
            System.out.println(result3 + "result3 is greater");
        } else {
            System.out.println(result4 + "result4 is greater");
        }
        if ((result1 < result2) && (result1 < result3) && (result1 < result4)) {
            System.out.println(result1 + "result1 is smaller");
        } else if ((result2 < result3) && (result2 < result4)) {
            System.out.println(result2 + "result2 is smaller");
        } else if (result3 < result4) {
            System.out.println(result3 + "result3 is smaller");
        } else {
            System.out.println(result4 + "result4 is smaller");
        }
    }
}
