package com.Assignment;
import java.util.Scanner;
public class reverseStringWhileLoop {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String a = in.nextLine();
        String reversed = "";

        int b=a.length();
        while((b-1)>=0){
            reversed=reversed+a.charAt(b-1);
            b--;
        }
        System.out.println(reversed);
        if(a.equals(reversed)){
            System.out.print("palindrome");
        }else{
            System.out.print("not palindrome");
        }
    }
}
