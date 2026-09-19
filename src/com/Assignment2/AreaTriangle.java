package com.Assignment2;

import java.util.Scanner;
public class AreaTriangle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Side 1 of the triangle: ");
        float a = sc.nextFloat();
        System.out.print("Enter side 2 of the triangle: ");
        float b = sc.nextFloat();
        System.out.print("Enter side 3 of the triangle: ");
        float c = sc.nextFloat();


        if(a+b>c && a+c>b && b+c>a){

            if (a == b && b != c) {
                double h = Math.sqrt(a * a - (c / 2.0f) * (c / 2.0f));
                double area = 0.5 * h * c;
                System.out.println("this is an isosceles triangle");
                System.out.println("The area of the triangle is: " + area);
            }
            if (a != b && b == c) {
                double h = Math.sqrt(b * b - (a / 2.0f) * (a / 2.0f));
                double area = 0.5 * h * a;
                System.out.println("this is an isosceles triangle");
                System.out.println("The area of the triangle is: " + area);
            }
            if (a == c && b != c) {
                double h = Math.sqrt(a * a - (b / 2.0f) * (b / 2.0f));
                double area = 0.5 * h * b;
                System.out.println("this is an isosceles triangle");
                System.out.println("The area of the triangle is: " + area);
            }
            if ((a != c && b != c) && a != b) {
                System.out.println("This is not an isoceles triangle");
                double s = (a+b+c)/2.0f;
                double area = Math.sqrt(s*(s-a)*(s-b)*(s-c)) ;
                System.out.println("Area of the triangle is: "+area);
            }
            if (a == c && b == c) {
                System.out.println("This is an equilateral triangle");
                double area = ((Math.sqrt(3))/4)*a*a;
                System.out.println("Area of the triangle is: "+area);
            }


        }else{
            System.out.println("Impossible triangle");

        }

        sc.close();

    }
}
