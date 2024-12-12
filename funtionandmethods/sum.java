package funtionandmethods;
import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
   int ans =sum3(20,40);
   System.out.println(ans);
}

// pass the value of the number when you are calling the method in main()

static int sum3(int a,int b){
    int sum=a+b;
    return sum;
}
static int sum2(){
    Scanner in = new Scanner(System.in); ///when we call the function wht is the value of ir funtion
    System.out.println("enter the first num:");
    
     int num1 =in.nextInt();   // this are the parameter
    System.out.println("enter the second num:");
     int num2=in.nextInt(); // this is parameter
    int Sum=num1+num2;
    return Sum; // when we return a funtion it is over
    
   } 
}

/*
 * return_type name (){
 * //boby
 * return statement;
 * }
 */