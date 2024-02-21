
// Q. Develop a Java program that displays a simple menu to the user with options (e.g., 1. Add, 2. Subtract, 3. Multiply, 4. Divide). Based on the user's choice, perform the corresponding arithmetic operation using a switch case statement.
import java.util.Scanner;

public class problem4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Simple Calculator Menu:");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

         System.out.print("Enter the first number: ");
            int a = scanner.nextInt();

            System.out.print("Enter the second number: ");
            int b = scanner.nextInt();
            int result = 0;

            switch (choice) {
                case 1:
                    result = a + b;
                    break;
                case 2:
                    result = a - b;
                    break;
                case 3:
                    result = a * b;
                    break;
                case 4:
                    if (b != 0) {
                        result = a / b;
                      break;
                    }
                    default:
                    System.out.println("Error: Invalid choice");
                    
            }

            System.out.println("Result: " + result);
        }

      
    }
}



    

