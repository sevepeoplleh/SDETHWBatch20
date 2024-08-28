package org.example.e106;

public class E106StringBuilder {
    public static void main(String[] args) {
        StringBuffer a=new StringBuffer();
        a.append("Hello ");
        a.append("World");
        String upperCaseStr = a.toString().toUpperCase();
        System.out.println(upperCaseStr);

    }
}
