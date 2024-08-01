package org.example.e72;

import java.util.Scanner;

public class E72Arrays {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        String[]size=new String[7];

        for (int i = 0; i < size.length; i++) {
            System.out.println("Please enter day "+(i+1)+" of the week:");
            size[i]=scan.nextLine();
        }
        for (int i = 0; i < size.length; i++) {
            System.out.println(size[i]);

        }




        // Create a Scanner object to read input from the console


        // Create an array of strings with size 7


        // Use a loop to prompt the user to input the days of the week one by one and store each input in the array

        // Use another loop to iterate through the array and print each value on a new line

        // Create a Scanner object to read input from the console



    }
}
