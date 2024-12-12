import java.util.Scanner;

public class casecheck {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    //.trim is used to remove the extra space in the output from front
   /*    String word="hello";
         System.out.println(word.charAt(1));
   */
   char ch =sc.next().trim().charAt(0);
   //to cheak weather the given letter is uppercade or lowercase
   if(ch>='a' && ch<='z'){
    System.out.println("loewer case");
   }else{
    System.out.println("upper case");
   }
} 
}
