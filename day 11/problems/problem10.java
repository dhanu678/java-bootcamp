// Q. Write a program to find sum of first 'n' numbers.
import java.util.Scanner;
 class problem10 {
public static void main (String[] args){
      
         Scanner input = new Scanner(System.in);
         System.out.println("Enter the value of n :");
         int n = input.nextInt();


        int sum = 0;

        for(int i= 1; i <= n; i++){
            sum += i;
        }
        System.out.println("The sum of the first " + n + " numbers is: " + sum);
    }
}

