package org.example.e114;

public class E114JavaMethods {
    public static void main(String[] args) {
        add(10,20);
        multiply(10,3);
        subtract(30,10);
        // Call the add method with arguments that add up to 30

        // Call the multiply method with arguments that multiply to 30

        // Call the subtract method with arguments that subtract to 20

    }

    public static void multiply (int i, int i2){
        int result=i*i2;
        System.out.println("Multiplication "+result);
    }
    public static void add (int i, int i2){
        int result=i+i2;
        System.out.println("Addition "+result);
    }
    public static void subtract (int i, int i2){
        int result=i-i2;
        System.out.println("Subtraction "+result);
    }

    // Create method multiply with two integer parameters and a print statement to display the result

    // Create method add with two integer parameters and a print statement to display the result

    // Create method subtract with two integer parameters and a print statement to display the result

}
