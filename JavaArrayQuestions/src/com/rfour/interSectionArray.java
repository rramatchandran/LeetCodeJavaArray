package com.rfour;
import java.util.HashSet;

public class interSectionArray {

    public static void main(String[] args) {

        int[] num1 = {9,2,2,1};
        int[] num2 = {9,2};
        interSectionArray sn = new interSectionArray();

        int[] intsec = sn.duplicinterSectionate(num1,num2);

        for(int i=0;i<intsec.length;i++)
            System.out.println(intsec[i]);

    }

    public int [] duplicinterSectionate(int[] nums1, int [] nums2) {
        HashSet<Integer> set = new HashSet<Integer>();
         for(int i:nums1){
             set.add(i);
         }

        HashSet<Integer> intersect = new HashSet<Integer>();
        for(int i:nums2){
            if(set.contains(i)){
                intersect.add(i);
            }
        }

        int[] result = new int[intersect.size()];
        int index = 0;

        for(int i:intersect){
            result[index++] = i;
        }

        return result  ;
    }
}