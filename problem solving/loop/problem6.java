import java.util.Scanner;
class problem6 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter a number to reverse:");
        int number = scanner.nextInt();

        int reverseNumber = 0;
        while(number!= 0){
            int digit = number%10;
            reverseNumber = reverseNumber* 10 +digit;
            number/= 10;
         }
         System.out.println("reversed number:" + reverseNumber);
         scanner.close();

    }
    
}
