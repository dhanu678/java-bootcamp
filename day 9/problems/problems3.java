
    import java.util.Scanner;
    public class problems3 {
        public static void main (String[] args){
    
    
            Scanner input = new Scanner (System.in);
            System.out.println("Enter the Number :");
            int userNum = input.nextInt();
              
            int x = 100;
            if (userNum > x ){
                System.out.println("The user number is greter than given number.");
            } else{
                System.out.println("The user number is smaller.");
            }
    
        }
    }