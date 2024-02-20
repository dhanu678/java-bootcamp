import java.util.Scanner;

class problem8 {
    public static void main (String[] args){
       
       Scanner input = new Scanner (System.in);
       System.out.println("Enter the income :");
       int income = input.nextInt();
       int taxrate = 0;

       if (income>= 250000  && income <= 500000){
              taxrate = 5;
       } else if (income >= 500000 && income <= 1000000){
               taxrate = 20;
       } else if (income >= 1000000){
               taxrate = 30 ;
       }

       int tax = income /100 * taxrate;
       System.out.println("The income tax is :"+ tax);
        System.out.println("The income tax rate is :" + taxrate);
    }
}

