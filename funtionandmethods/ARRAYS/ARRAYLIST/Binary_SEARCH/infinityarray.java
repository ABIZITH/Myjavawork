package funtionandmethods.ARRAYS.ARRAYLIST.Binary_SEARCH;

public class infinityarray {
    public static void main(String[] args) {
        int []arr = {3,4,8,10,30,40,50,52,56,59,64,70,80,85};
        int target = 50;
        System.out.println(ans(arr, target));
    }
    static int ans(int[]arr,int target){
        int start =0;
        int end =1;

        while (target>arr[end]){
            int newstaart = end + 1;
            end = end +(end- start+1)*2;
            start = newstaart;
        }
        return binary(arr, target,start,end);

    }
    static int binary(int [] arr,int target,int start,int end ){
        while (start<=end) {

        int mid = start + (end-start)/2;

        if(target<arr[mid]){
            end = mid-1;
        }else if (target> arr[mid]){
            start =mid +1;
        }else{
            return mid;
        }
    }
return -1;
}
}