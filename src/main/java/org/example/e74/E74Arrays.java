package org.example.e74;

import java.util.Scanner;

public class E74Arrays {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

int[]size=new int[5];

        for (int i = 0; i < size.length; i++) {
            size[i]=scan.nextInt();
        }
        for (int i = 0; i <size.length; i++) {
            System.out.println(size[i]*10);
        }
        // Create a Scanner object to read input from the console


        // Create an array of integers with a size of 5


        // Use a loop to read 5 integers from the user and store them in the array
        // (Do not print any prompt message for the user)

        // Use another loop to multiply each element of the array by 10 and print the result

    }
}
