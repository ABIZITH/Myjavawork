package ARRAYS.ARRAYLIST.Binary_SEARCH;

public class findthescope {
    public static void main(String[] args) {

        int [] arr={2,3,4,5,6,8,9,10};
        int target= 8;
        int result = binary(arr, target);
        System.out.println("Target found at index: " + result);

    }

    /**
     * @param arr
     * @param target
     * @return
     */
    static int binary(int [] arr,int target){
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
        return -1;
    }
}
