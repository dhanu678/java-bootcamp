import java.util.Scanner;

class problem9 {
       public static void main (String[] args){

        Scanner input = new Scanner (System.in);
        System.out.println("Enter the number: ");
        int day = input.nextInt();

        if ( day ==1 ){
            System.out.println("It is monday");
        }else if (day ==2){
            System.out.println("It is tuesday");
        }else if (day ==3){
            System.out.println("It is wednesday");
        }else if (day ==4){
            System.out.println("It is thursday");
        }else if (day ==5){
            System.out.println("It is friday");
        }else if (day ==6){
            System.out.println("It is saturday");
        }else if (day ==7){
            System.out.println("It is sundday");
        }else {
            System.out.println("Enter the number is wrong please check again");
        }

    }
}
    

