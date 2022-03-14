package com.infogalaxy;

import java.util.Scanner;

public class LineComparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Line Comparison Problem developed by InfoGalaxy Computers.");
        //UC-1 Length of Line 1 Calculated
        double x1;
        double x2;
        double y1;
        double y2;
        System.out.println("Enter the Point for X1 and Y1 : ");
        x1 = sc.nextDouble();
        y1 = sc.nextDouble();
        System.out.println("Enter the Point for X2 and Y2 : ");
        x2 = sc.nextDouble();
        y2 = sc.nextDouble();
        double lengthOfLine1 = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        System.out.println("Length of Line 1 : "+ lengthOfLine1);
    }
}
