package ARRAYS;

import java.util.Arrays;

public class colnotfixed {
    public static void main(String[] args) {
         int [][] arr ={
            {1,2,3},
            {2,3},
            {2,4,5}
         };
         for(int row=0;row<arr.length;row++){
            for (int col = 0; col < arr[row].length; col++) {
                System.out.print(arr[row][col] + "");
            }
            System.out.println();
         }
    }
    
}
