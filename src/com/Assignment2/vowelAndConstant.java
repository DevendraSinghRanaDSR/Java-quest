package com.Assignment2;

import java.util.Scanner;

public class vowelAndConstant {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a character: ");

        // Read the input and take just the first character as a String
        String ch = in.next().toLowerCase();

        // Check if the input is a single alphabetical character
        if (ch.length() != 1 || !Character.isLetter(ch.charAt(0))) {
            System.out.println("Error: Please enter a single valid alphabetical character.");
        } else if (ch.equals("a") || ch.equals("e") || ch.equals("i") || ch.equals("o") || ch.equals("u")) {
            System.out.println("The character is a vowel");
        } else {
            System.out.println("The character is a consonant");
        }

        in.close(); // Good practice to close the scanner
    }
}
