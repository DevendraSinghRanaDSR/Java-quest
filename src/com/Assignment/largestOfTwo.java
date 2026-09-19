package com.Assignment;
import java.util.Scanner;
public class largestOfTwo {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.print("enter num1: ");
        float num1 = in.nextFloat();
        System.out.print("enter num2: ");
        float num2 = in.nextFloat();

        if(num1>num2){
            System.out.println("num1 is greater than num2 that is :"+num1);
        } else{
            System.out.println("num2 is greater than num1 that is :"+num2);
        }
    }
}
