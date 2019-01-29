package com.rfour;

public class rotateImage {
    public static void main(String[] args) {
        int [][] matrix  = {{1,2,3},
                            {4,5,6},
                            {7,8,9},
                            };

        rotateImage ts = new rotateImage();
        ts.rotate(matrix);
    }

    public void rotate(int [][] matrix){
        int a=0, b = matrix.length-1;
        while(a<b){
            int[] temp = matrix[a];
            matrix[a] = matrix[b];
            matrix[b] = temp;
            a++; b--;
        }
        for(int i= 0; i<matrix.length;i++){
            for(int j=i+1;j<matrix.length; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        for(int i= 0; i<matrix.length;i++){
            for(int j=0;j<matrix.length; j++){
                System.out.println(matrix[i][j]);
            }
        }




    }

}
