package org.example.e133;

public class E133StaticKeyword {
    public static int countA(String s) {
        StringBuilder str=new StringBuilder();
        int count=0;

        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)=='a'||s.charAt(i)=='A'){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {

        System.out.println(countA("aaa"));
        System.out.println(countA("aaBBdf8k3AAadnklA"));
}
}

