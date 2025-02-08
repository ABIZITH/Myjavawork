package ARRAYS.ARRAYLIST.Linear_search;

public class findminium {
    // find the minium of the array element 
    public static void main(String[] args) {
        int [] arr ={2,3,4,56,7,1};
        System.out.println(min(arr));
    }

    static int min(int[] arr){
      int ans=arr[0];
      for (int i = 1; i < arr.length; i++) {
        if( arr[i] < ans){  
            // change the < lesser then symbol to > grater then to find the maxium value element
            ans =arr[i];
        }
      }
      return ans;
    }
    
}
