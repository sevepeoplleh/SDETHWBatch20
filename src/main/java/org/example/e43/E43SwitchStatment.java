package org.example.e43;

import java.util.Scanner;

public class E43SwitchStatment {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your electricity usage in kWh");

        int usage = scan.nextInt();
        double bill = 0;
        int usageGroup = usage / 100;

        switch (usageGroup) {
            case 0:
                bill = usage * 0.12;
                break;
            case 1:
                bill = usage * 0.15;
                break;
            case 2:
                bill = usage * 0.20;
                break;
            default:
                System.out.println("Invalid usage entered");
        }
        System.out.printf("Your electricity bill is $ "+ bill);
        // Create a Scanner object to read input

        // Print prompt for user to enter their electricity usage in kWh
        // Capture the usage input

        // Calculate bill using switch statement

        // Print the bill
        // Output: Your electricity bill is $____

    }
}

