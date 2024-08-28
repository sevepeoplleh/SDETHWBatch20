package org.example.e116;

public class E116JavaMethods {
    public static void main(String[] args) {
        System.out.println(bothEven(11,20));
        // Call the bothEven method with various arguments to test the method
    }
    public static boolean bothEven(int i, int i2){
        return (i%2==0)&&(i2%2==0);
    }

    // Create method bothEven with two integer parameters
    // Inside the method, check if both numbers are even
    // Return true if both numbers are even, otherwise return false
}
