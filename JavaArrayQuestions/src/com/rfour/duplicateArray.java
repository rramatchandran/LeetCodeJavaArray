package com.rfour;

public class duplicateArray {

    public static void main(String[] args) {
	// write your code here
     //This one removes duplicates

     int arr[] = {1,2,2,3,4,4,5,6,6,7,7,7,7,7,7,8,8,8};

     int temp[] = new int[arr.length];
     int j = 0;

      for (int i=0; i<arr.length-1; i++){
          if (arr[i] != arr[i+1]){
                  temp[j++] = arr[i];
            }
        }

      temp[j++] = arr[arr.length-1];
      for(int k=0; k<j; k++){
          System.out.println(temp[k]);
      }
    }
}
