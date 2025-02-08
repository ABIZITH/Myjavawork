package ARRAYS.ARRAYLIST.Binary_SEARCH;

public class findfloor {
    public static void main(String[] args) {

        
        int [] arr={2,3,5,9,14,16,18};
        int target= 1;
        int result = floor(arr, target);
        System.out.println("Target found at index: " + result);

    }

      // floor will return the index of greatest 
    static int floor(int [] arr,int target){
        int start =0;
        int end = arr.length-1;

        //find wheather the array is sorted  or not 
        boolean acen;
            if(arr[start]< arr[end]){
                acen = true;
            }else{
                acen = false;
            }
        
        while(start<=end){
            int mid = start+(end-start)/2;

            if(arr[mid] == target){
                return mid;
            }
            // return the mid element if target us equal to mid 
            
           if(acen){
            if(target<arr[mid]){
                end = mid-1;
            }else {
                start =mid +1;
            }

            }else{

            if(target>arr[mid]){
                end = mid-1;
            }else {
                start =mid +1;
            }
           }
        }
        return end;
    }
}

