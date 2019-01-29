package com.rfour;

import java.util.HashMap;

public class singleNumber {
    public static void main(String[] args) {


        int [] singN =  {2,2,6,2,2};
        singleNumber sn = new singleNumber();

        int dups = sn.duplicate(singN);
        System.out.println(dups);

    }

    public int duplicate(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i:nums){
            map.put(i, map.getOrDefault(i,0)+1);
        }
        for(int key:map.keySet()){
            if(map.get(key) ==1)
                return key;
        }
        return -1;
    }
}
