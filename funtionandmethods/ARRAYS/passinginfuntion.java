package ARRAYS;

import java.util.Arrays;

public class passinginfuntion {
    public static void main(String[] args) {
        int[] nums = {23,3,4,3,34};
        System.out.println(Arrays.toString(nums));
        // calling the funtion change which print the  modified values 
        change(nums);
        System.out.println(Arrays.toString(nums));
    }
    static void change(int[]arr){
    arr[1] = 20; 
    }
}
