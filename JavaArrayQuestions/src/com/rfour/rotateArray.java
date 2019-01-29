package com.rfour;

public class rotateArray {


    public static void main(String[] args) {

        int [] arr = {1,2,3,4,5,6,7};
        int k = 5;
        k = k%arr.length;
        rotateArray rt = new rotateArray();
        rt.rotate(arr,0,k);



    }

    public void rotate (int[] nums, int i, int j){
        while (i<j){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }

        String str = "" ;
        for (int l=0; l<nums.length-1;l++) {
            if (l <1)
                str = "" +  nums[l];
            else
                str = str+  "," +nums[l] ;
        }

        System.out.println(str);
    }


}
