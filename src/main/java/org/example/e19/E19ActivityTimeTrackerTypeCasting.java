package org.example.e19;

public class E19ActivityTimeTrackerTypeCasting {
    public static void main(String[] args) {
        double activity1=45.5;
        double activity2= 30.2;
        double activity3=60.7;
        double totalTime=activity1+activity2+activity3;
        int roundedTime=(int)totalTime;
        int hours=roundedTime/60;
        int minutes=roundedTime%60;

        System.out.println("The original total time is "+totalTime+" minutes.");
        System.out.println("The converted time is "+hours+" hours and "+minutes+" minutes.");
        // Declare the double variables and assign values


        // Calculate total time


        // Type cast the total time to an int to get total minutes


        // Calculate hours and remaining minutes


        // Print the results
    }
}
