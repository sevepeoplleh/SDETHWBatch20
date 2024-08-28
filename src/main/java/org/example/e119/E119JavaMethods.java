package org.example.e119;

public class E119JavaMethods {
    public static void main(String[] args) {

        System.out.println(censorLetter("computer science",'e'));
        System.out.println(censorLetter("trick or treat",'t'));
        // Students will write the code here.
    }

    public static String censorLetter (String s, char c){
        StringBuilder Str=new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)==c){
                Str.append("*");


            }else{
                Str.append(s.charAt(i));
            }
        }

        return Str.toString();
    }

}
