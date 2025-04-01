package BubbleSorting;

import java.util.Arrays;

public class bubblesort {
    public static void main(String[] args) {
        int []arr= {5,4,3,2,1};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }

     static void bubble(int []arr){
        
        // run the steps n-1 times
        boolean  swapped;
        for (int i = 0; i < arr.length; i++) {
            swapped = false;

            // for each the steps , max item will come at the respective index
            for (int j = 1; j < arr.length - i; j++) {

                //swap if the items is smaller then the previous item
                if(arr[j] < arr[j-1]){

                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp; 
                    swapped = true;
                }
            }
            //if you did noy swap for a particular value of i , it means the array is sorted hence stop the program
            if(!swapped){// false ==true
                break;
            }
        }
     }
}
