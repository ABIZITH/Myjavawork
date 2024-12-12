package ARRAYS.ARRAYLIST;

public class maximum {
    public static void main(String[] args) {
        int []arr ={9,3,4,5,6,7};
        System.out.println(max(arr));
    } 
   // maxium between range  
    static int maxrange(int[]arr, int Start,int end){ 

        int maxval= arr[Start];
        for(int i = 1; i < end; i++) {
         if(arr[i] > maxval){
            maxval =arr[i];
         }
       } 
       return maxval;
    }
    //imagine the arr is not empty

    static int max(int[]arr){ 
        int maxval= arr[0];

        for(int i = 1; i < arr.length; i++) {
         if(arr[i] > maxval){
            maxval =arr[i];
         }
       } 
  return maxval;
}  
}
