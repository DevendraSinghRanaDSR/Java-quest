package com.Assignment;
import java.util.Scanner;
public class fibonacciWhileLoop {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int count=0;
        int a=0;
        int b=1;
        while(count<n){
            System.out.print(a +" ");
            int c=a+b;
            a=b;
            b=c;

            count++;
        }

    }
}
