// Q. Write a program to check whether a number is positive or negative.
import java.util.Scanner;
public class problem1 {
  public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (number > 0) {
            System.out.println("It is a positive number.");
        } else if (number < 0) {
            System.out.println("It is a negative number.");
        } else {
            System.out.println("The number is zero.");
        }

        scanner.close();
    }
}

