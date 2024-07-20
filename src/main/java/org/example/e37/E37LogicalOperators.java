package org.example.e37;

import java.util.Scanner;

public class E37LogicalOperators {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Are you thirsty? (true/false)");
        boolean isThirsty=scan.nextBoolean();
        System.out.println("Are you sleepy? (true/false)");
        boolean isSleepy=scan.nextBoolean();
        String drink;
        if(isThirsty && !isSleepy){
            drink="water";
        }else if(isThirsty && isSleepy){
            drink="coffee";
        }else if(!isThirsty&&isSleepy){
            drink="tea";
        }else {
            drink="nothing";
        }
        System.out.println("Looks like you need to drink "+drink);
        // Create a Scanner object to read input

        // Print prompt for user to answer if they are thirsty
        // Capture the thirsty input

        // Print prompt for user to answer if they are sleepy
        // Capture the sleepy input

        // Determine the drink based on the inputs

        // Print the drink suggestion
        // Output: Looks like you need to drink ___
    }
}
