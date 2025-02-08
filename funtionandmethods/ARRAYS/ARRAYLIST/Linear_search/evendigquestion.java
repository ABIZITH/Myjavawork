package ARRAYS.ARRAYLIST.Linear_search;

//  https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
public class evendigquestion {

/*
leetcode 
question 1:
input =nums ={12,345,2,6,7893}
output : 2
Explanation:
     12 contains 2 digit (even)
     345 contains 3 digit (odd)
     ""
     ""

*/
public static void main(String[] args) {
     int [] num ={12,345,2,6,7893};
     System.out.println(findnumber(num));
     System.out.println(even(292992));
     
}
//
static int findnumber(int []num){
     int count =0;
     for (int nums : num) {
          if(even(nums)){
               count++;
          }   
     }
     return count;
}


// funtion to check whether a number contains even digits or not
static boolean even(int num){
     int numberofdigit =digit(num);
     if(numberofdigit % 2==0){
          return true;
     }
          return false;
}

// count the number of digits n a number 
static int digit(int num){

     if(num < 0){
          num =num * -1; // to count he negative numbers
     }
     if(num == 0){
          return 1;
     }

     int count =0;
     while(num>0){
     count++;
     num /= 10;
}
return count;
}
}
