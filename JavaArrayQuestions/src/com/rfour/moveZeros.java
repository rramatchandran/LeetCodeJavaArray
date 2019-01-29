package com.rfour;

public class moveZeros {
    public static void main(String[] args) {

        int[] digits = {9,2,0,0,2,9};

        moveZeros mvz = new moveZeros();

        int[] mvzf = mvz.moveZerosToEnd(digits);

        for(int i=0;i<mvzf.length;i++)
            System.out.println(mvzf[i]);

    }

    public int [] moveZerosToEnd(int[] digits) {
        int index = 0;
        for(int i=0; i<=digits.length-1;i++) {
            if(digits[i] !=0){
                digits[index++] = digits[i];
            }
        }

        for(int i=index; i<=digits.length-1;i++) {
             digits[i] = 0;
        }

        return digits  ;
    }



}
