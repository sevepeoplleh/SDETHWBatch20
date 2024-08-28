package org.example.e100;

import java.util.Scanner;

public class E100StringManipulations {
    public static void main(String[] args) {
Scanner scan=new Scanner(System.in);
        System.out.println("In: ");
        String str="";
String a=scan.next();
        for (int i = a.length() - 1; i >= 0; i--) {
            str += a.charAt(i);
        }
        System.out.println(str);
    }
}
