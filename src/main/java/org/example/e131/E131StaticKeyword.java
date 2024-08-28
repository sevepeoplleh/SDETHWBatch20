package org.example.e131;

public class E131StaticKeyword {
    public static String thirdLetter(String s){
        StringBuilder s1=new StringBuilder();

        for (int i = 0; i < s.length(); i+=3) {
            s1.append(s.charAt(i));
        }


        return s1.toString();
    }
    public static void main(String[] args) {
        System.out.println(thirdLetter("hello there"));
        System.out.println(thirdLetter("technology"));
    }
}
