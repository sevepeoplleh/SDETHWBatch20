package org.example.e40;

import java.util.Scanner;

public class E40SwitchClass {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter name of the instructor");
        String responsibility=scan.nextLine();

        switch (responsibility){
            case "Asghar":
                System.out.println("Will take care of Java Assignment");
                break;
            case "Moazzam":
                System.out.println("Will take care of SDLC Assignment");
                break;
            case "Weqas":
                System.out.println("Will take care of Selenium Assignment");
                break;
            case "Asel":
                System.out.println("Will take care of every Assignment");
                break;
            default:
                System.out.println("Invalid instructor selected");


        }




        // Create a Scanner object to read input

        // Print prompt for user to enter the name of the instructor
        // Capture the instructor name input

        // Determine the responsibility based on the instructor's name using a switch statement


        // Print the responsibility


    }
}
