
// Q. Create a Java program that takes a numerical grade as input from the user and converts it to a letter grade (A, B, C, D, or F) using a switch case statement. The grading scale can be based on typical academic standards.
    import java.util.Scanner;

    class problem2 {
        public static void main (String[] args){
 
            Scanner input = new Scanner(System.in);
            System.out.println("Enter the marks: ");
            int grade = input.nextInt();
    
            switch(grade / 10){
    
                case 9:
                    System.out.println("A Grade");
                    break;
                case 8:
                    System.out.println("B Grade");
                    break;
                case 7:
                    System.out.println("C Grade");
                    break;
                case 6:
                    System.out.println("D Grade");
                    break;
                case 5:
                    System.out.println("F Grade");
                    break;
            }
        }
    }

