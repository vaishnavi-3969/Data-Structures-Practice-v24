package Archives.Turnby180Degree;

import java.util.Arrays;

/*
Given a square matrix,
the task is that turn it by 180 degrees in an
anti-clockwise direction without using any extra space.

* */
public class Main {
    public static void main(String[] args) {
        int[][] matrix = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };
        rotate180(matrix);
        for (int[] ints : matrix) {
            System.out.println(Arrays.toString(ints));
        }
    }
    public static void rotate180(int[][] matrix){
        rotate90Degree(matrix);
        rotate90Degree(matrix);
    }
    public static void swap(int[][] matrix, int row, int col){
        int temp = matrix[row][col];
        matrix[row][col] = matrix[col][row];
        matrix[col][row] = temp;
    }
    public static void rotate90Degree(int[][] matrix){
        //step 1: find transpose of the matrix
        int rows = matrix.length;
        int cols = matrix[0].length;
        for(int row=0; row<rows; row++){
            for(int col=0; col<row; col++){
                swap(matrix, row, col);
            }
        }
        //step 2: reverse the columns
        for(int row=0; row<rows; row++){
           for(int col=0; col<cols/2; col++){
               int temp = matrix[row][col];
               matrix[row][col] = matrix[row][cols-col-1];
               matrix[row][cols-col-1] = temp;
           }
        }
    }
}
