package org.example.e121;

public class E121Variables {
     private int integerVal;
     private double doubleVal;
     private char charVal;
    // Declare 3 instance variables: integer, double, and char

    public static void main(String[] args) {
        E121Variables object1=new E121Variables();
        object1.integerVal=10;
        object1.doubleVal=10.23;
        object1.charVal='a';
        E121Variables object2=new E121Variables();
        object2.integerVal=100;
        object2.doubleVal=100.23;
        object2.charVal='s';

        System.out.println(object1.integerVal);
        System.out.println(object1.doubleVal);
        System.out.println(object1.charVal);
        System.out.println(object2.integerVal);
        System.out.println(object2.doubleVal);
        System.out.println(object2.charVal);
        // Create 2 instances of the class
        // Assign values to variables for the first instance
        // Print values of the first instance
        // Assign values to variables for the second instance
        // Print values of the second instance
    }

}
