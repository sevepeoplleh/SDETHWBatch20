package org.example.e128;

public class E128StaticKeyword {

    public static String mixString (String s1, String s2){
        StringBuilder str1=new StringBuilder();
        
        int l1=s1.length();
        int l2=s2.length();

        int maxl=Math.max(l1,l2);

        for (int i = 0; i <maxl; i++) {
            if(i<l1){
                str1.append(s1.charAt(i));
            }if(i<l2){
                str1.append(s2.charAt(i));
            }
        }
        return str1.toString();
    }
    public static void main(String[] args) {
        String s1="12345";
        String s2="abcde";

        String mixedString=mixString(s1,s2);
        System.out.println(mixedString);
    }

}