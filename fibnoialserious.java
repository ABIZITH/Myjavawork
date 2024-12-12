import java.util.Scanner;
public class fibnoialserious {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        int count = 2;

//To find the fibno serious number by add the 2 perious number of the serious

        while (count<=n) {
            int temp=b;
            b=b+a;
            a=temp;
            count++;
 
        }
     //    
        System.out.println(b);

    }
}
