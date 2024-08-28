package org.example.e126;

import org.example.e123.E123Variables;

import org.example.e125.E125Variables;

public class E126Variables {
    private static boolean instanceCount;
    // Declare a static variable at the class level to hold the count of all instances of the class


    // Constructor to increment the count


    public static void main(String[] args) {

        E126Variables s=new E126Variables();
        E126Variables s1=new E126Variables();
        E126Variables s2=new E126Variables();
        System.out.println(E126Variables.instanceCount);
        // Create 3 objects of the class


        // Print the value of the count variable
    }
}
