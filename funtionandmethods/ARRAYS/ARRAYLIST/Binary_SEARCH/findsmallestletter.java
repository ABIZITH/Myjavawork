package ARRAYS.ARRAYLIST.Binary_SEARCH;

public class findsmallestletter {

    // https://leetcode.com/problems/find-smallest-letter-greater-than-target/
    public static void main(String[] args) {

        char[] letters = {'a','b','d','e','f'};
        char target= 'c';
        char result = ceiling(letters, target);
        System.out.println("Target found at index: " + result);

    }

      // ceiling return the index of smallest no >= target
    static  char ceiling(char[] letters,char target){
        int start = 0;
        int end = letters.length-1;

        while(start<=end){
            int mid = start+(end-start)/2;

            if(target<letters[mid]){
                end = mid-1;
            }else{
                start = mid +1;
            }
        }
        return letters[start %letters.length];
    }
}
