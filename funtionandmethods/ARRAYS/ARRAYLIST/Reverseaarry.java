package ARRAYS.ARRAYLIST;

import java.util.Arrays;

public class Reverseaarry {
    public static void main(String[] args) {
        int [] arr ={1,2,9,8,5,6};

        Reverse(arr);
        System.out.println(Arrays.toString(arr));

    } // using swap method we are reversing a array

    static void Reverse(int []arr){
        int start = 0;
        int end = arr.length-1; // minuse 1 from length of array

       while (start < end ){
        swap(arr,start,end);
        start++;
        end--;
       }  
    }
    static void swap(int[]arr,int index1,int index2){

        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] =temp;
     
         }
}
