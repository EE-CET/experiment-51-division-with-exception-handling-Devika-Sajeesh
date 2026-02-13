import java.util.Scanner;

public class DivisionHandling {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        try {
            int result = a / b; // Enclose division in try block
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) { // Catch ArithmeticException
            System.out.println("Error: Division by zero is not allowed.");
        }
    }
}
