package org.example.e97;

import java.util.Scanner;

public class E97StringManipulations {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter a browser name:");
        String a=scan.nextLine();
        if(a.equalsIgnoreCase("Chrome")){
            System.out.println("Proceed with Chrome browser");
        }else if(a.equalsIgnoreCase("firefox")){
            System.out.println("Proceed with Firefox browser");
        }else if(a.equalsIgnoreCase("IE")){
            System.out.println("Proceed with IE browser");
        }else{
            System.out.println("Invalid browser");
        }
        // Create a Scanner object to read input from the console

        // Prompt the user to input a browser name


        // Read the input string


        // Use conditional statements to print the message based on the input
        // If the input is "Chrome", "chrome", "CHROME", or "ChRoMe", print "Proceed with Chrome browser"
        // If the input is "firefox", "FIREFOX", or "FireFOX", print "Proceed with Firefox browser"
        // If the input is "IE", "ie", or "iE", print "Proceed with IE browser"
        // For any other input, print "Invalid browser"

    }
}
