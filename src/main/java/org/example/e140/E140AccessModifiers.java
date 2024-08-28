package org.example.e140;

public class E140AccessModifiers {
    static String maxLength(String[] words){
        String str="";

        for(String word:words){
            if(word.length()>str.length()){
                str=word;
            }
        }


        return str;
    }

    public static void main(String[] args) {
        String[]max={"this", "is", "a", "long", "word"};

        String str=maxLength(max);
        System.out.println(str);
    }

}
