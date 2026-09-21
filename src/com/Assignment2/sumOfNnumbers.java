package com.Assignment2;

import java.util.Scanner;
public class sumOfNnumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = in.nextInt();
        int sum = 0;
        int i = 1;
        while(i<=n){
            sum = sum+i;
            i++;
        }
        System.out.println("sum of N numbers= "+sum);
        in.close();
    }
}
