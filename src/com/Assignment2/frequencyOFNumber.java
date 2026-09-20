package com.Assignment2;


public class frequencyOFNumber {
    public static void main(String[] args) {
        long a = 2223311234224L;

        int count = 0;
        while(a>0){

            long rem = a%10L;
            if(rem==2){
                count++;
            }
            a=a/10;


        }
        System.out.println(count);
    }
}
