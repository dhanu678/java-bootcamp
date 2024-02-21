// Q. Write a program to whether a number is multiple of 5 or not

    import java.util.Scanner;

    public class problem4 {
    public static void main (String[] args){
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number :");
        int a = input.nextInt();

        if (a % 5 == 0){
            System.out.println("number is multiple of 5");
        }else{
            System.out.println("number is not multiple of 5");

        }
    }
}

