package org.example.e118;

public class E118JavaMethods {

    public static void main(String[] args) {
        System.out.println(spaceOut("Hello"));
        // Students will write the code here.
    }

    public static String spaceOut(String s){
        StringBuilder S=new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            S.append(s.charAt(i)).append(" ");
        }




return S.toString();
    }


}
