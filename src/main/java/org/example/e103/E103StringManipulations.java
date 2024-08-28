package org.example.e103;

import java.util.Scanner;

public class E103StringManipulations {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("In:");
        String a=scan.next();
        for (int i = 0; i < a.length(); i++) {
            if(i==a.length()-1){
                System.out.print(a.charAt(i));
            }else{
                System.out.print(a.charAt(i)+" ");
            }

        }
        System.out.println();
    }
}
