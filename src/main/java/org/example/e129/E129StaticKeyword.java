package org.example.e129;

public class E129StaticKeyword {
    static String n1;
    static String n2;

    public static void s1(){
        System.out.println(n1+" located on "+n2+" continent");
    }
    public static void main(String[] args) {
        n1="Morocco";
        n2="Africa";
        s1();

        }

    }

