package funtionandmethods;

import java.util.Scanner;

public class stringexample {
    public static void main(String[] args) {
       // String message= sum();
        //System.out.println(message);
        Scanner in = new Scanner(System.in);
        System.out.println("enter the name :");
        String name =in.next();
        String point=mygreet(name);
        System.out.println(point);
}

        static String mygreet(String names){
            String message="hello "+ names;
            return message;
        }

    static String sum(){
        String greeting ="how r u now";
        return greeting;

    }
}
