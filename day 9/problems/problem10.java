import java.util.Scanner;//imp questions

public class problem10 {
      public static void main (String[] args){
     
     Scanner input = new Scanner (System.in);
     System.out.println("Enter the Year: ");
     int year = input.nextInt();

       if (year % 400 == 0 && year % 100 != 0 || year % 4== 0){
        System.out.println("The " + year + " leap year");
       } else {
         System.out.println("The  "+ year + " not leap year");
    }

}
}

    


