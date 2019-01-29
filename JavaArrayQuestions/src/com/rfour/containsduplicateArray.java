package com.rfour;

import java.util.HashSet;

//finds if we have duplicate in a array using hashset

public class containsduplicateArray {
    public static void main(String[] args) {

        //int [] dup =  {1,2,3,1};
        int [] dup =  {1,2,3,4};


        containsduplicateArray dp = new containsduplicateArray();
        boolean dups  = dp.duplicate(dup);
        System.out.println(dups);

    }

    public boolean duplicate(int[] nums){
        HashSet<Integer> set = new HashSet<Integer>();
        for(int i:nums){
            if(set.contains(i)){
                return true;
            }else
                set.add(i);
        }

        return false;
    }

}
