package ARRAYS;

import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);

         // this are array of primitives
        int arr[] = new int[5];
        arr[0] = 20;
        arr[1] = 25;
        arr[2] = 27;
        arr[3] = 29;
        arr[4] = 23;
        // System.out.println(arr[3]);
    
        // //input using for loop

        // for( int i=0;i<arr.length;i++){
        //     arr[i]= in.nextInt();
        // }
        // System.out.println(Arrays.toString(arr));
        
        // // for(int i=0;i<arr.length;i++){
        // //     System.out.print(arr[i] + "");
        // // }
        
        // // for( int Null : arr){             //for every element in a array , it print the element
        // //    System.out.println(Null + ""); // here null represent the element 
        // // } 

                 //array of object 

        String[] str =new String[5];
        for(int i=0;i<str.length;i++){
            str[i] = in.next();
        }
        System.out.println(Arrays.toString(str));

        str[1] ="abijith";
        System.out.println(Arrays.toString(str));
        
    }
}
