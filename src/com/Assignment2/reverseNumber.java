package com.Assignment2;

import java.util.Scanner;
public class reverseNumber {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        long a = in.nextLong();
        while(a!=0){
            long rem = a%10;
            System.out.print(rem+"");
            a=a/10;
        }
        in.close();
    }
}
