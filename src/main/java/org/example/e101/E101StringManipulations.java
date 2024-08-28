package org.example.e101;

import java.util.Scanner;

public class E101StringManipulations {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("In: ");
        String a=scan.next();

        for (int i = 0; i < a.length(); i+=2) {
            System.out.print(a.charAt(i));
        }
        System.out.println();

    }
}
