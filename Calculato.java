import java.util.Scanner;

public class Calculato{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ans = 0;
        while (true) {
            // Take the operator as input
            System.out.print("Enter the operator (+, -, *, /, %): ");
            char op = sc.next().trim().charAt(0);

            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
                // Input two numbers
                System.out.print("Enter the first number: ");
                int num1 = sc.nextInt();
                System.out.print("Enter the second number: ");
                int num2 = sc.nextInt();

                if (op == '+') {
                    ans = num1 + num2;
                } else if (op == '-') {
                    ans = num1 - num2;
                } else if (op == '*') {
                    ans = num1 * num2;
                } else if (op == '/') {
                    if (num2 != 0) {
                        ans = num1 / num2;
                    } else {
                        System.out.println("Error: Division by zero!");
                    }
                } else if (op == '%') {
                    if (num2 != 0) {
                        ans = num1 % num2;
                    } else {
                        System.out.println("Error: Modulus by zero!");
                    }
                }

                System.out.println("Result: " + ans);
            } else if (op == 'x' || op == 'X') {
                System.out.println("Exiting the program...");
                break;
            } else {
                System.out.println("Invalid operator!");
            }
        }
    }
}