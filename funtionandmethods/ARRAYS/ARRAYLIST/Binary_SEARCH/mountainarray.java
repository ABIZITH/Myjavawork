package ARRAYS.ARRAYLIST.Binary_SEARCH;

public class mountainarray {

    //https://leetcode.com/problems/peak-index-in-a-mountain-array/
    public static void main(String[] args) {
        mountainarray obj = new mountainarray();
        int[] arr = {1, 3, 5, 6, 4, 2}; // Example mountain array
        int peakIndex = obj.peakIndexInMountainArray(arr);
        System.out.println("Peak Index: " + peakIndex); // Expected output: 3
    }

    public int peakIndexInMountainArray(int[] arr) {
        int start =0;
       int end = arr.length-1;

       while (start < end) {
        int mid =start+(end-start)/2;

        if(arr[mid] > arr[mid+1]){
              //you are in the decreasing part 
              // this may be the answer , but look at left nd side
              // this is y end != mid-1
              end =mid;
        }else{
            // you maybe in the incresing part of array
            start =mid+1; // because we know that mid+1 = element > then mid element
        }
       }
       // in the end , start == end ,and pointing to the largest number because of the 2 check above
       // start and end are always trying to find max element in the above 2 ckecks 
       // hence , when they are pointing to just one element , that is the mac one because  that is wht the ckeck says
       // more elaboration at every point of the start and end , they have the bestpossible answer till that time
       // and if we are saying that only one item is remaining , hence of the above line is the best possible time

       return start ; //or either end because both are equal at the end  
    }
}
