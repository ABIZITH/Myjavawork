package funtionandmethods;
import java.util.Scanner;
public class summethod {
    public static void main(String[] args) {
        sum(); // function call
    }
    static void sum(){ // we use static function 
        // if we dont want to return anything just write void

    Scanner in = new Scanner(System.in); ///when we call the function wht is the value of ir funtion
    System.out.println("enter the first num:");
    int num1,num2,Sum;
     num1 =in.nextInt();
    System.out.println("enter the second num:");
     num2=in.nextInt();
    Sum=num1+num2;
    System.out.println("the result: "+ Sum);
    } 
}
/*
 * return_type name (){
 * //boby
 * return statement;
 * }
 */