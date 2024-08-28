package org.example.e105;

import java.util.Scanner;

public class E105StringManipulations {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("In:");
        String a=scan.nextLine();

        for (int i = 0; i < a.length(); i++) {
            if(a.charAt(i)=='a'||a.charAt(i)=='e'||a.charAt(i)=='i'||a.charAt(i)=='o'||a.charAt(i)=='u'){
                System.out.print(a.charAt(i));
            }

        }
        System.out.println();


    }
}
