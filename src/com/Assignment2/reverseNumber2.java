package com.Assignment2;

import java.util.Scanner;
public class reverseNumber2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long ans = 0;

        while(n!=0){
            long rem = n%10;
            n=n/10;
            ans = ans*10+rem;

        }
        System.out.println(ans);
    }
}
