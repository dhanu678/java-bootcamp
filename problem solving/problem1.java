//  given number is divisible by  or not:
import java.util.Scanner;
class problem1{
    public static void main(String[]args){
        Scanner input =new Scanner(System.in);
        System.out.println("enter your number ");
        int number = input.nextInt();
        System.out.println("enter your divisible");
        int divisible = input.nextInt();

     if(number% divisible ==0){
        System.out.println(number + " " +" number is divisible by" +" " + divisible );
     }   
     else{
        System.out.println(number + " this number is not divisible by " +"  " + divisible);
     }

    }
}

