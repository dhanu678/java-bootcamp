// Q. Write a program to check whether a number is positive or negative.
import java.util.Scanner;
class problem2 {
    public static void main(String[]args){
        Scanner input  = new Scanner(System.in);
        System.out.println("enter your number  -> ");
         int number =input.nextInt();

    if (number > 0 ){
        System.out.println("this is postive number");
        }
        else if( number<0){
            System.out.println("this is negative number");
        }
        else{
            System.out.println("this number is zero");

        }
      
    }

    
}
