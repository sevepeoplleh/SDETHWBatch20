package org.example.e39;

import java.util.Scanner;

public class E39LogicalOperators {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter your mark");

        int marks=scan.nextInt();
        String grade;
        if(marks>=1&& marks<=25){
            grade="F";
        }else if(marks>=26&&marks<=45){
            grade="E";
        }else if(marks>=46 &&marks<=50){
            grade="D";
        }else if(marks>=51&&marks<=60){
            grade="C";
        }else if(marks>=61 &&marks<=80 ){
            grade="B";
        }else if(marks>=81&&marks<=100){
            grade="A";
        }else{
            System.out.println("Please enter valid mark");
            return;
        }
        System.out.println("Your grade is "+grade);
        // Create a Scanner object to read input

        // Print prompt for user to enter their mark
        // Capture the mark input

        // Determine the grade based on the mark


        // Print the grade
        // Output: Your grade is ____


    }
}
