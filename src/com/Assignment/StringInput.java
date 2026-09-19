package com.Assignment;
import java.util.Scanner;
public class StringInput {
    public static void main(String[] args) {
        System.out.print(" Enter a string: ");
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        System.out.println("Hello you name is : " + str);

        in.close();
    }
}
