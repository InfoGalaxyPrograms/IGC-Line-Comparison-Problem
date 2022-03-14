package com.infogalaxy;

import java.util.Scanner;

public class LineComparison {

    public static void equals(double lengthOfLine1,double lengthOfLine2) {
        if(lengthOfLine1 == lengthOfLine2) {
            System.out.println("Both Lines are Same.");
        } else {
            System.out.println("Lines are Not Same.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Line Comparison Problem developed by InfoGalaxy Computers.");
        //UC-1 Length of Line 1 Calculated
        double x1;
        double x2;
        double y1;
        double y2;
        //UC-2 Length of Line 2 Calculated
        double a1;
        double a2;
        double b1;
        double b2;
        System.out.println("Enter the Point for X1 and Y1 : ");
        x1 = sc.nextDouble();
        y1 = sc.nextDouble();
        System.out.println("Enter the Point for X2 and Y2 : ");
        x2 = sc.nextDouble();
        y2 = sc.nextDouble();
        double lengthOfLine1 = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        System.out.println("Length of Line 1 : "+ lengthOfLine1);

        System.out.println("Enter the Point for A1 and B1 : ");
        a1 = sc.nextDouble();
        b1 = sc.nextDouble();
        System.out.println("Enter the Point for A2 and B2 : ");
        a2 = sc.nextDouble();
        b2 = sc.nextDouble();
        double lengthOfLine2 = Math.sqrt(Math.pow((a2 - a1), 2) + Math.pow((b2 - b1), 2));
        System.out.println("Length of Line 2 : "+ lengthOfLine2);

        equals(lengthOfLine1, lengthOfLine2);
    }
}
