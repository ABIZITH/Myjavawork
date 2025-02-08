package ARRAYS.ARRAYLIST.Linear_search;

public class findrange {
    public static void main(String[] args) {

        int [] arr = {1,2,3,4,5,6};
        int Target =3;
        System.out.println(searcharr(arr, Target, 1,5));
        
    }

    static  int searcharr(int [] arr,int target, int Start,int end ){
        if(arr.length==0){
            return-1;
        }
        // run for a loop
        for (int index = Start; index < end; index++) {

            int element = arr[index];
            if(element==target){
               return index;
            } 
        }

        // this line will execute if none of the return statemnet above hae executed .
        // hence the target not found 
        return-1;
    }
}
