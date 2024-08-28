package org.example.e84;

public class E84NestedForLoops {
    public static void main(String[] args) {
        // Declare and initialize the 2D array to store the multiplication table values


        int[][] table = new int[5][10];
        int[]starting={6,7,8,9,10};
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                table[i][j] = ((starting[i]-1)+1) * (j+1);
                System.out.print(table[i][j]+" ");
            }
            System.out.println();
        }

        // Use nested loops to fill the 2D array with multiplication table values

        // Use nested loops to iterate through the 2D array and print the pattern

    }
}
