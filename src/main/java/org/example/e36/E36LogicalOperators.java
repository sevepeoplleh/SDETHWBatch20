package org.example.e36;

import java.util.Scanner;

public class E36LogicalOperators {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter your monthly rent expense");
        int rentExpense=scan.nextInt();
        System.out.println("Please enter your monthly food expense");
        int foodExpense=scan.nextInt();
        System.out.println("Please enter your monthly transportation expense");
        int transportationExpense=scan.nextInt();
        System.out.println("Please enter your monthly entertainment expense");
        int entertainmentExpense=scan.nextInt();
        if(rentExpense>foodExpense && transportationExpense>entertainmentExpense){
            System.out.println("You are prioritizing essentials well.");
        }else if(rentExpense>foodExpense || transportationExpense>entertainmentExpense){
            System.out.println("You are on the right track, but could improve.");
        }else if(rentExpense<foodExpense || transportationExpense<entertainmentExpense){
            System.out.println("You need to rethink your spending priorities.");
        }
        // Create a Scanner object to read input

        // Print prompt for user to enter their monthly rent expense
        // Capture the rent expense input

        // Print prompt for user to enter their monthly food expense
        // Capture the food expense input

        // Print prompt for user to enter their monthly transportation expense
        // Capture the transportation expense input

        // Print prompt for user to enter their monthly entertainment expense
        // Capture the entertainment expense input


    }
}
