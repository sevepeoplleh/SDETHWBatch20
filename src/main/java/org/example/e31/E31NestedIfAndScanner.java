package org.example.e31;

import java.util.Scanner;

public class E31NestedIfAndScanner {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Is it sunny outside? (true/false)");
        boolean isSunny=scan.nextBoolean();
        if(isSunny==true){
            System.out.println("It is a sunny day, I should go somewhere!");
            System.out.println("What is the temperature outside?");
            int temperature=scan.nextInt();
            if(temperature>85){
                System.out.println("I am going to the beach!");
            }else{
                System.out.println("I am going to the park!");
            }
        }else{
            System.out.println("I stay home and practice Java");
        }
        // Create a Scanner object to read input

        // Declare a boolean variable isSunny
        // Print "Is it sunny outside? (true/false)"
        // Capture the user's input and store it in isSunny

        // Declare an integer variable temperature

        // Use an if-else statement to check if it is sunny


    }
}
