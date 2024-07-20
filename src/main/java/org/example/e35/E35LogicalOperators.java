package org.example.e35;

import java.util.Scanner;

public class E35LogicalOperators {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Do you need a loan? (true/false)");
        boolean needsLoan=scan.nextBoolean();
        String eligibility;
        if (needsLoan) {
            System.out.println("What is your credit score?");
            int creditScore = scan.nextInt();

            if (creditScore < 600) {
                eligibility = "Not eligible";
            } else if (creditScore >= 600 && creditScore <= 700) {
                eligibility = "Maybe eligible";
            } else if (creditScore >= 701 && creditScore <= 800) {
                eligibility = "Eligible";
            } else {
                eligibility = "Definitely eligible";
            }
        } else {
            eligibility = "Unknown";
        }

        System.out.println("The eligibility is "+eligibility);
        // Create a Scanner object to read input

        // Print prompt for user to answer if they need a loan
        // Capture the loan requirement input

        // Check if the user needs a loan

        // Step 1: Create a Scanner Object




    }
}
