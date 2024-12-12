package ARRAYS.ARRAYLIST;

import java.util.ArrayList;       
import java.util.Scanner;
                       
                        //  size is fixed internally 
                        // say arraylist filled by some amount
                        // it will create a new arraylist and double it to a new one 
                        // old element in pervious list are copied in the new one 
                        // old one deleted

public class arraylistexample {
    public static void main(String[] args) {
       Scanner in =new Scanner(System.in);
        // syntax for array list

         ArrayList<Integer> list = new ArrayList<>(10);
  
    //     list.add(224929);
    //     list.add(2999292);
    //     list.add(89898929);
    //     list.add(7889292);
    //     list.add(3565929);
    //     list.add(243552);
        
    //     System.out.println(list);

    //     list.set(0,00001);  // to change the value of the extisting index value we use---list.set()
    //                                       //everything will use .tostring method to convert and store it 
    //     System.out.println(list);

    for (int i = 0; i < 5; i++) {
        list.add(in.nextInt());
    }
    //get item at any index
    for (int i = 0; i < 5; i++) {
        System.out.println(list.get(i));  //pass the index here ,list[index] syntax will not work here 
    }
    }
    
}
