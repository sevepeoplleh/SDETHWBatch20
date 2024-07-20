package org.example.e18;

public class E18ShoppingCartRoundingTypeCasting {
    public static void main(String[] args) {
        double item1=19.99;
        double item2=29.75;
        double item3=4.99;
        double totalCost =item1+item2+item3;

        int roundedCost=(int)totalCost;

        System.out.println("The original total cost is $" +totalCost);
        System.out.println("The rounded total cost is $"+roundedCost);
        // Declare the double variables and assign values


        // Calculate total cost


        // Type cast the double to an int to round it down


        // Print the results

    }
}
