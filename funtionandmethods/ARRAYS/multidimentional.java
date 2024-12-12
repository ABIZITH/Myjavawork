package ARRAYS;

import java.util.Arrays;
import java.util.Scanner;

public class multidimentional {
    public static void main(String[] args) {
        // 123
        // 123
        // 122                          rows and columns
         //int[][] arr = new int [3][3]; // giving the column valuse is not necessory in java array
        Scanner in = new Scanner(System.in);

        // int[][] arr= {
        //     {1,2,3}, // oth index
        //     {4,5,6}, // 1st index
        //     {7,8,9}  // 2nd index
        // };

        // // //INPUT
        // // for(int i=0;i<arr.length;i++){
        // //     arr[i] =in.nextInt(arr);

        int[][] arr = new int[3][3];
        // System.out.println(arr.length);
         
          // input
          for(int row=0;row<arr.length;row++){

            for(int col=0; col<arr[row].length; col++){
               arr[row][col] =in.nextInt();
            }
          }
          //output
          for(int row=0;row<arr.length;row++){

            for(int col=0; col<arr[row].length;col++){

               System.out.print(arr[row][col] +" ");
            }
            System.out.println();
            // System.out.println(Arrays.toString(arr[row]));
            // to convert the array to string and to enhance to ...
          }
           //in.close(); close the scanner object 
        }
    }

