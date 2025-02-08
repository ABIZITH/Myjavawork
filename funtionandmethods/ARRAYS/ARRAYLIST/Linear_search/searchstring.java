package ARRAYS.ARRAYLIST.Linear_search;

import java.util.Arrays;

public class searchstring {
    public static void main(String[] args) {
        String str= "abijith";
        char Target = 'b'; 

        System.out.println(search(str, Target)); // check is the target B is there in the string
        System.out.println(Arrays.toString(str.toCharArray()));
    }
    
     //to use the "tochararray" method we can put string element in a array
    static boolean searchstr(String str, char Target){
        if(str.length() == 0){
            return false;
        }
        for (char ch :str.toCharArray()) {
            if (ch == Target){
            return true;
            }
        }
        return false;
    }

    static boolean search(String str, char Target){
        if(str.length() == 0){
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if (Target ==str.charAt(i)){
            return true;
            }
        }
        return false;
    }
    
}
