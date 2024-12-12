import java.util.Arrays;

public class varagrument {
    public static void main(String[]args){
        fun(2,23,4,5,5,5,5,5,5,5);
        }
        static void fun(int ...v){  // we can take any no of arguments by using ( ...v) it store everything in array
               System.out.println(Arrays.toString(v));

        }

    }
