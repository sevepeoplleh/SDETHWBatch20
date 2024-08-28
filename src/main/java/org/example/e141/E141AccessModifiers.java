package org.example.e141;

public class E141AccessModifiers {

    public static int maxValue(int[] nums) {
        int max=nums[0];
        for (int i = 0; i < nums.length; i++) {
            if(max<nums[i]){
                max=nums[i];
            }
        }
        return max;


    }

    public static void main(String[] args) {

        int[] arr = {1, 5, 22, 3, 7};

        int res=maxValue(arr);

        System.out.println(res);


    }
}