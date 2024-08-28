package org.example.e87;

public class E87ClassAndObject {
    public static void main(String[] args) {
        Car c1=new Car();
        c1.carColor="Black";
        c1.carMake="BMW";
        c1.carYear=2019;

        Car c2=new Car();
        c2.carColor="White";
        c2.carMake="Toyota";
        c2.carYear=2018;
        System.out.println("Car color is "+c1.carColor+" and car year is "+c1.carYear+" and car model is "+c1.carMake);
        System.out.println("Car color is "+c2.carColor+" and car year is "+c2.carYear+" and car model is "+c2.carMake);
        // Create a class named 'Car'

        // Declare a String variable named 'carColor'
        // Declare an integer variable named 'carYear'
        // Declare a String variable named 'carMake'

        // Create the first object of the class 'Car'

        // Assign the value "Black" to the 'carColor' variable of the first object
        // Assign the value 2019 to the 'carYear' variable of the first object
        // Assign the value "BMW" to the 'carMake' variable of the first object

        // Create the second object of the class 'Car'

        // Assign the value "White" to the 'carColor' variable of the second object
        // Assign the value 2018 to the 'carYear' variable of the second object
        // Assign the value "Toyota" to the 'carMake' variable of the second object

        // Print the values of the properties for both objects in the specified format



    }
}
