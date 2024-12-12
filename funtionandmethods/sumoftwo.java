package funtionandmethods;

import java.util.Scanner;

public class sumoftwo {
    public static void main(String[] args) {
        sum();
        sum();
    }
        static void sum(){
        
    Scanner in = new Scanner(System.in);
    System.out.println("enter the first num:");
    int num1,num2,Sum;

     num1 =in.nextInt();
    System.out.println("enter the second num:");
     num2=in.nextInt();
    Sum=num1+num2;
    System.out.println("the result: "+ Sum);
        }
    }

