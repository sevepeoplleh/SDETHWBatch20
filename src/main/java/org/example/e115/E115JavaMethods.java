package org.example.e115;

public class E115JavaMethods {
    public static void main(String[] args) {
        convertToUpper("test");

        // Call the convertToUpper method and print the result
    }
    public static void convertToUpper (String string){
        string=string.toUpperCase();
        System.out.println(string);

    }

    // Create method convertToUpper with a string parameter
    // Inside the method, convert the string to uppercase using toUpperCase method
    // Return the new uppercase string
}
