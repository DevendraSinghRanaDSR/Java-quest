package com.Assignment;

import java.util.Scanner;
public class twoCoordinateDistance {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the X coordinate of first point: ");
        int x1=sc.nextInt();
        System.out.print("Enter the Y coordinate of first point: ");
        int y1=sc.nextInt();
        System.out.print("Enter the X coordinate of second point: ");
        int x2=sc.nextInt();
        System.out.print("Enter the Y coordinate of second point: ");
        int y2=sc.nextInt();

        double dis=Math.sqrt((x1-x2)*(x1-x2) + (y1-y2)*(y1-y2));
        System.out.println("The distance between the two points is: "+dis);
    }
}
