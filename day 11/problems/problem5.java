// Q Write a program to check weather a character is alphabet or not.

import java.util.Scanner;
 class problem5 {
   public static void main (String[] args){

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the char: ");
        char ch = input.next().charAt(0);

        if ((ch >='a' && ch <= 'z') || (ch >+'A' && ch <= 'Z')){
            System.out.println("This is alphabet");
        }else{
            System.out.println("This is not a alphabet");
        }
    }
}
    

