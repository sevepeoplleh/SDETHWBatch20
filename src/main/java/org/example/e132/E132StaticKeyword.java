package org.example.e132;

public class E132StaticKeyword {
    public static int[][] s1(int[][] nums){
        int[][]res=new int[nums.length][nums[0].length];

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[0].length; j++) {
                res[i][j]=nums[i][j]-10;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int[][]nums={
            {1, 2, 3, 4},
            {4, 5, 6, 7},
            {1, 3, 5, 7}
        };
        int[][] res2=s1(nums);

        for (int i = 0; i <res2.length ; i++) {
            for (int j = 0; j < res2[i].length; j++) {
                System.out.print(res2[i][j]+" ");
            }
            System.out.println();
        }
    }

}

