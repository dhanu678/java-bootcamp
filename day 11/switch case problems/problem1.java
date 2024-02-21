// // Q. Write a Java program to implement a simple calculator that takes two numbers and an
//  operator (+, -, *, /) as input from the user and performs the corresponding  operation using a switch case statement.
import java.util.Scanner;
class problem1{
    public static void main (String[]args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the operator -> ");
        char operator = scanner.next().charAt(0);
         
        System.out.println("Enter the first number-> ");
        int a = scanner.nextInt();

        System.out.println("Enter the second number-> ");
        int b = scanner.nextInt();
        int result = 0;
        switch (operator) {
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '*':
                result = a * b;
                break;
            case '/':
                if (b != 0) {
                    result = a / b;
                } 
                break;
                default:
                    System.out.println("Error: Invalid operator");
                    System.exit(1);
            }
            System.out.println("answer -->> " + result);
    }

    }
