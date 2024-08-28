package org.example.e102;

import java.util.Scanner;

public class E102StringManipulations {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("In:");
        String a=scan.next();
        for (int i = 0; i < a.length(); i++) {
            System.out.println(a.charAt(i));
        }

    }
}
