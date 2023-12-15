package Strivers_Sheet.Day1_Arrays.Set_Matrix_Zeroes;

import java.util.Arrays;

class Solution {
    public static void main(String[] args) {
        int[][] arr = {
                {1,1,1},
                {1,0,1},
                {1,1,1}
        };
        setZeroes(arr);
        for(int[] rows: arr){
            System.out.println(Arrays.toString(Arrays.stream(rows).toArray()));
        }
    }
    public static void setZeroes(int[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[0].length; col++) {
                if (matrix[row][col] == 0) {
                    setColsZero(row, matrix);
                    setRowsZero(col, matrix);
                }
            }
        }
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[0].length; col++) {
                if (matrix[row][col] == -1) {
                    matrix[row][col] = 0;
                }
            }
        }
    }

    public static void setColsZero(int row, int[][] matrix) {
        for (int col = 0; col < matrix[0].length; col++) {
            if (matrix[row][col] != 0) {
                matrix[row][col] = -1;
            }
        }
    }

    public static void setRowsZero(int col, int[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            if (matrix[row][col] != 0) {
                matrix[row][col] = -1;
            }
        }
    }
}
