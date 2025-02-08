package ARRAYS.ARRAYLIST.Linear_search;

import java.util.Arrays;
// search in a 2D array 
public class search2Darray {
    public static void main(String[] args) {
        
        int [][] arr ={
            {1,2,3},
            {4,5,6},
            {7,8,9,0},
            {3,6,11}
        };
        int target = 11;
        int [] ans= search(arr, target); //format of the return value will be like {row,col}

        System.out.println(Arrays.toString(ans)); //
        System.out.println(max(arr));

        int[] maxIndex = maxindex(arr); // Return indices of the maximum value
        System.out.println("Max Value Found At: " + Arrays.toString(maxIndex)); // display the maxium element index value

    } 
    // to find the maxium in the 2D array 
    static int max(int [][] arr){
        
        int max = Integer.MIN_VALUE;
        for (int row = 0; row < arr.length; row++) {
            for (int col= 0; col < arr[row].length; col++) {
                if(arr[row][col] > max){
                    max = arr[row][col];
                }     
            }
        }
        return max;
    }

    // to find the index value of the maxium element 
    static int[] maxindex(int[][] arr) {
        int max = Integer.MIN_VALUE;
        int[] index = {-1, -1}; // To store row and column of max value
    
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] > max) {
                    max = arr[row][col];
                    index[0] = row; // Store row index
                    index[1] = col; // Store column index
                }
            }
        }
        return index; // Return the indices of the max value
    }
    
    

    static int[] search(int [][] arr,int target){
        for (int row = 0; row < arr.length; row++) {
            for (int col= 0; col < arr[row].length; col++) {
                if(arr[row][col] == target){
                    return new int []{row,col};
                }     
            }
        }
        return new int[]{-1,-1};
    }
    
}
