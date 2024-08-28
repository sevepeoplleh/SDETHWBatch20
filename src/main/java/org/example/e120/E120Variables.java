package org.example.e120;

public class E120Variables {
    private int year;
    private String schoolName;
    private int batchNumber;

    public E120Variables(int year, String schoolName, int batchNumber) {
        this.year = year;
        this.schoolName = schoolName;
        this.batchNumber = batchNumber;
    }

    public E120Variables() {

    }

    public void printInfo() {
        System.out.println("Year: " + year);
        System.out.println("School Name: " + schoolName);
        System.out.println("Batch #: " + batchNumber);
    }

    public static void main(String[] args) {
        E120Variables student = new E120Variables(2020, "High School", 6);

        student.printInfo();
        // Access variables from the main method and assign specific values to them
        // Print values of your variables in the specified format
    }
}
