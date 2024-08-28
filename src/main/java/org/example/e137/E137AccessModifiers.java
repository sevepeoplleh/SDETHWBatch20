package org.example.e137;

public class E137AccessModifiers {
    private String name;
    String city;
    public String name_of_the_school;
    protected int batch_number;

    public void s1(){
        System.out.println("My name is "+name+" and I live in "+city+". I study at "+name_of_the_school+" in batch "+batch_number);
    }

    public static void main(String[] args) {
        E137AccessModifiers str=new E137AccessModifiers();
        str.name="John";
        str.city="Miami";
        str.name_of_the_school="Syntax";
        str.batch_number=9;

        str.s1();
    }
}

