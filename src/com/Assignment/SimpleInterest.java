package com.Assignment;
import java.util.Scanner;
public class SimpleInterest {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.print("Enter Principle: ");
        int p =in.nextInt();
        System.out.print("Enter Interest rate: ");
        int r=in.nextInt();
        System.out.print("Enter Time: ");
        int t=in.nextInt();

        float simpleInterest = (p*r*t)/100;
        System.out.println("Simple interest is "+simpleInterest);
        System.out.println("Amount in the end of year "+t+" will be :"+(simpleInterest+p));
    }
}
