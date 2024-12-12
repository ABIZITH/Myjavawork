import java.util.Scanner;

public class switchcase {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
    /*     String fruit =sc.next();

         switch (fruit) {
            case " mango":
            System.out.println("the famous fruit in madhurai");
            break;
            case "apple":
            System.out.println("the doctor fruit");
            break;
            case "cherry":
            System.out.println("soo costly fruit");
            break;
        
            default:
            System.out.println("give the corret input");
             */

             int day=sc.nextInt();
             switch(day){
                case 1-> System.out.println("monday");
                case 2-> System.out.println("tuesday");
                case 3-> System.out.println("wednesday");
                case 4-> System.out.println("thur");
                case 5-> System.out.println("friday");
                case 6-> System.out.println("saturaday");

             }
        }
}
