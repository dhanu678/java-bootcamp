
//  find the largestnumber :
import java.util.Scanner;

class problem3 {
    public  static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter your 1st number->");
        int num1 = input.nextInt();
        System.out.println("enter your 2nd number->");
        int num2 = input.nextInt();
        System.out.println("enter your 3rd number->");
        int num3 = input.nextInt();

        int largestnumber = num1;
        if (num2 > largestnumber) {
            largestnumber = num2;
        }

        if (num3 > largestnumber) {
            largestnumber = num3;
        }

        System.out.println("largestnumber is " + " ---> " + largestnumber);
    }

}
