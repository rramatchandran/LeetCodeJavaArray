package com.rfour;

public class plusOne {

    public static void main(String[] args) {

        int[] digits = {9,2,2,9};

        plusOne pl = new plusOne();

        int[] pls = pl.plusones(digits);

        for(int i=0;i<pls.length;i++)
            System.out.println(pls[i]);

    }

    public int [] plusones(int[] digits) {

        for(int i=digits.length-1; i>=0;i--) {
            if(digits[i]<9){
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
         }

        digits = new int[digits.length+1];
        digits[0] =1;

        return digits  ;
    }
}
