// Q. Implement a Java program that takes an integer representing a day number (1 for Sunday, 2 for Monday, etc.) and prints the corresponding day of the week using a switch case statement.
    import java.util.Scanner;
    public class problem5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a day number : ");
        int dayNumber = scanner.nextInt();

        String day;

        switch (dayNumber) {
            case 1:
                day  = "Sunday";
                break;
            case 2:
                day = "Monday";
                break;
            case 3:
                day = "Tuesday";
                break;
            case 4:
                day = "Wednesday";
                break;
            case 5:
                day = "Thursday";
                break;
            case 6:
                day = "Friday";
                break;
            case 7:
                day = "Saturday";
                break;
            default:
                day = "Invalid day number";
                break;
        }

        System.out.println("Day of the week: " + day);

        scanner.close();
    }
}

    

