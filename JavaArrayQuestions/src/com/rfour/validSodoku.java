package com.rfour;

import java.util.HashMap;
import java.util.Map;

public class validSodoku {
    public static void main(String[] args) {
        char [][] board =  {{'5','3','.','.','7','.','.','.','.'},
                {'6','.','.','1','9','5','.','.','.'},
                {'.','9','8','.','.','.','.','6','.'},
                {'8','.','.','.','6','.','.','.','3'},
                {'4','.','.','8','.','3','.','.','1'},
                {'7','.','.','.','2','.','.','.','6'},
                {'.','6','.','.','.','.','2','8','.'},
                {'.','.','.','4','1','9','.','.','5'},
                {'.','.','.','.','8','.','.','7','9'},
        };


        char[][] board2 = {
                {'8','3','.','.','7','.','.','.','.'},
                {'6','.','.','1','9','5','.','.','.'},
                {'.','9','8','.','.','.','.','6','.'},
                {'8','.','.','.','6','.','.','.','3'},
                {'4','.','.','8','.','3','.','.','1'},
                {'7','.','.','.','2','.','.','.','6'},
                {'.','6','.','.','.','.','2','8','.'},
                {'.','.','.','4','1','9','.','.','5'},
                {'.','.','.','.','8','.','.','7','9'},
                };

        validSodoku ts = new validSodoku();
        boolean isValid  = ts.isValidSodukus(board);
        boolean isValidf  = ts.isValidSodukus(board2);

       System.out.println(isValid);
        System.out.println(isValidf);

    }

    public boolean isValidSodukus(char [][] board){
        boolean[][] rows = new boolean[9][9];
        boolean[][] cols = new boolean[9][9];
        boolean[][] box = new boolean[9][9];


        for (int row=0; row <9;row++){
            for(int col=0;col<9;col++){
                if(board[row][col] != '.'){

                    int num = board[row][col] -'1';
                    int k = (row/3)*3 + col/3;
                    if(rows[row][num] || cols[col][num] || box[k][num]) {
                        return false;
                    }
                    else{
                         rows[row][num] = true;
                         cols[col][num] = true;
                         box[k][num] = true;
                    }
                }
            }
        }


        return true;
    }
}
