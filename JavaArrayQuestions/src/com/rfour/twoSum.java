package com.rfour;

import java.util.HashMap;
import java.util.Map;

public class twoSum {

    public static void main(String[] args) {
        int [] sum =  {2,7,11,15};
        int target = 18;

        twoSum ts = new twoSum();
        int [] twoSumIndex  = ts.twoSums(sum, target);

        for(int i=0;i<twoSumIndex.length;i++)
            System.out.println(twoSumIndex[i]);

    }

    public int[] twoSums(int[] nums, int target){
        int[] res = new int[2];

        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(target-nums[i])){
                res[1] = i;
                res[0] = map.get(target-nums[i]);
                return res;
            }
            map.put(nums[i], i);
        }
        return res;
    }


}
