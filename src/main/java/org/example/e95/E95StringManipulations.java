package org.example.e95;

import java.util.Scanner;

public class E95StringManipulations {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Please enter a word: ");
        String a=scan.nextLine();
        String na=a.substring(0,3);
        System.out.println("The first 3 letters of "+a+" is "+na );
        // Create a Scanner object to read input from the console

        // Prompt the user to input a string value


        // Read the input string


        // Extract the first 3 letters using the substring() method

        // Print the result in the specified format
    }
}
