package ARRAYS.ARRAYLIST.Linear_search;

public class search {
    public static void main(String[] args) {
        
        int arr[]={7,4,5,6,7,8};
        int target= 7;
        int ans =searcharr1(arr, target);
        
        System.out.println(ans);
    }

    //Search the target and retutn either true or false
    static boolean searcharr2(int [] arr,int target){
        if(arr.length==0){
            return false;
        }
        // run for a loop


            for(int element :arr){
            if(element==target){
               return true;
            } 
        }

        // this line will execute if none of the return statemnet above hae executed .
        // hence the target not found 
        return false;
    }

    //Search the target and retutn the element value
    static int searcharr1(int [] arr,int target){
        if(arr.length==0){
            return-1;
        }
        // run for a loop
        for (int i = 0; i < arr.length; i++) {

            int element = arr[i];
            if(element==target){
               return element;
            } 
        }

        // this line will execute if none of the return statemnet above hae executed .
        // hence the target not found 
        return Integer.MAX_VALUE;
    }

    // Search in the array :return the index(i) if the item found 
    // other wise if item not founded it return -1 .
    static int searcharr(int [] arr,int target){
        if(arr.length==0){
            return-1;
        }
        // run for a loop
        for (int i = 0; i < arr.length; i++) {

            int element = arr[i];
            if(element==target){
               return i;
            } 
        }

        // this line will execute if none of the return statemnet above hae executed .
        // hence the target not found 
        return-1;
    }
}
