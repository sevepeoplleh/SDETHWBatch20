package org.example.e123;

import org.example.e122.E122Variables;

public class E123Variables {

    int intValue;
    String stringValue;
    double doubleValue;
    boolean booleanValue;
    float floatValue;
    // Declare instance variables to hold integer, String, double, boolean, and float values
    public void dis(){
        System.out.println(intValue);
        System.out.println(stringValue);
        System.out.println(doubleValue);
        System.out.println(booleanValue);
        System.out.println(floatValue);
    }
    public static void main(String[] args) {
        E123Variables sss=new E123Variables();
        sss.dis();
        // Create an instance of the class
        // Access instance variables and print them without assigning any values

        // Print the default values of the instance variables

    }
}
