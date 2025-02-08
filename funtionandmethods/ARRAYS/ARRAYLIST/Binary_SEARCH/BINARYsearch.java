package ARRAYS.ARRAYLIST.Binary_SEARCH;

public class BINARYsearch {
    public static void main(String[] args) {
       
    int []arr= {-10,-5,-3,0,2,4,5,7,8,9};
    int target = -4;
    System.out.println(binary(arr,target));
        
    }
    // return the index
    // retrun -1 if it does not exist

    static int binary(int [] arr,int target){

        int start= 0;
        int end = arr.length-1;

        while (start<=end){
            // find the middle element 
            // int mid =start(start-end)/2; //might be possible that 

            int mid =start +(end - start)/2;
             
            if(target<arr[mid]){
                end = mid-1;
            }else if(target>arr[mid]){
                start =mid +1;
            }else{
                // answer found 
                return mid;
            }
        } 
        return -1;

    }
}
