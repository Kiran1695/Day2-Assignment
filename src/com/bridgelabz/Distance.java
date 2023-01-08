package com.bridgelabz;

import java.util.Scanner;

public class Distance {
    public static void main(String[] args) {
        int x1, x2, y1, y2;
        double dis;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter x1 point");
        x1 = scanner.nextInt();
        System.out.println("Enter x2 point");
        x2 = scanner.nextInt();
        System.out.println("Enter y1 point");
        y1 = scanner.nextInt();
        System.out.println("Enter y2 point");
        y2 = scanner.nextInt();
        dis = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
        System.out.println("distance between"+"("+x1+","+y1+"),"+"("+x2+","+y2+")===>"+dis);
    }
}
