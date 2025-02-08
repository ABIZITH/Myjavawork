package ARRAYS.PATTERNPRINTING;

import ARRAYS.ARRAYLIST.arraylistexample;

public class star {
    public static void main(String[] args) {
        // ****
        // ***
        // **
        // *
        pattern(5);
        pattern1(5);
        pattern2(5);
        pattern3(5);
        pattern4(5);
        pattern5(5);
        pattern6(5);
        pattern7(5);
        pattern8(5);
    }

   static void pattern8(int n){
    int orginalN =n  ;
    n = 2 * n;
    for (int row = 0; row <= n ;row++) {
        for (int col= 0;col <=n; col++) {
            int ateveryindex =orginalN -Math.min(Math.min(row, col),Math.min(n -row,n -col));
            ateveryindex = Math.max(ateveryindex,1);
            System.out.print(ateveryindex + " ");
        }
        System.out.println();
    }
   }
    
    static void pattern7(int n){
        for (int row = 1; row <= 2 * n; row++) {

            int c= row > n ? 2 * n -row: row;

            for (int spaces = 0; spaces < n-c; spaces++) {
                System.out.print("  ");
            }

            for (int col = c; col >= 1; col--) {
                System.out.print(col+" ");
            }
            for (int col = 2; col <=c; col++) {
                System.out.print(col+" ");
            }
            System.out.println();
        }

    }

    static void pattern6(int n){
        for (int row = 1; row <= n; row++) {

            for (int spaces = 0; spaces < n-row; spaces++) {
                System.out.print("  ");
            }

            for (int col = row; col >= 1; col--) {
                System.out.print(col+" ");
            }
            for (int col = 2; col <=row; col++) {
                System.out.print(col+" ");
            }
            System.out.println();
        }

    }



    static void  pattern5(int n){ 
        for (int row = 0; row < 2*n; row++) {
            // Determine the number of columns in the current row
            int totlacolsinrow = row > n ? 2 * n - row: row;
           // Calculate the number of leading spaces
        int noofspace = n -totlacolsinrow; 
        // print
        for (int s = 0; s < noofspace; s++) {
            System.out.print(" ");
        }
            for (int col = 0; col < totlacolsinrow; col++) {
                // printing the col no .
                System.out.print( "* ");

            }
            // when one row is printed ,we meed to add a new line
            System.out.println();
        }
    }

    static void  pattern4(int n){ 
        for (int row = 0; row < 2*n; row++) {
            int totlacolsinrow = row >n? 2*n -row: row;
            for (int col = 0; col < totlacolsinrow; col++) {
                // printing the col no .
                System.out.print( " * ");

            }
            // when one row is printed ,we meed to add a new line
            System.out.println();
        }
    }

    static void  pattern3(int n){
        for (int row = 1; row <=n; row++) {
            // for every row ,run the col
            for (int col = 1; col <=row; col++) {
                // printing the col no .
                System.out.print(col +"");

            }
            // when one row is printed ,we meed to add a new line
            System.out.println();
        }
    }

    static void  pattern1(int n){
        for (int row = 1; row <=n; row++) {
            // for every row ,run the col
            for (int col = 1; col <=row; col++) {
                System.out.print("*");
            }
            // when one row is printed ,we meed to add a new line
            System.out.println();
        }
    }
    static void  pattern(int n){
        for (int row = 1; row <=n; row++) {
            // for every row ,run the col
            for (int col = 1; col <=n-row+1; col++) {
                System.out.print("*");
            }
            // when one row is printed ,we meed to add a new line
            System.out.println();
        }
    }
    static void  pattern2(int n){
        for (int row = 1; row <=n; row++) {
            // for every row ,run the col
            for (int col = 1; col <=n; col++) {
                System.out.print("*");
            }
            // when one row is printed ,we meed to add a new line
            System.out.println();
        }
    }
    
}
