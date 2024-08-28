package org.example.e99;

import java.util.Scanner;

public class E99StringManipulations {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("Please enter a string:");
        String a=scan.nextLine();
        StringBuilder sb=new StringBuilder(a);
        sb.reverse();
        if(a.equals(sb.toString())){
            System.out.println("true");
        }else {
            System.out.println("false");
        }
        // Create a Scanner object to read input from the console

        // Prompt the user to input a string


        // Read the input string


        // Remove all spaces and convert the string to lowercase

        // Check if the string is a palindrome

        // Print "true" if the string is a palindrome, and "false" otherwise


        // Step 2: Create a Scanner object to read input from the console


    }
}
