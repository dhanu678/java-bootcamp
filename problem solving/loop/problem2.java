public class problem2 {
    public static void main(String[] args) {
        int number = 10;
       
        long factorial = factorialNumber(number);
        // long factorial = 1;
        // for (int i = 1; i <= number; i++) {
        //     factorial *= i;
            System.out.println("Factorial after multiplying by " + number + " is: " + factorial);
        }
        public static long factorialNumber(int number){
            long factorial = 1;
            for (int i = 1; i <= number; i++) {
                factorial *= i;
                System.out.println("Factorial after multiplying by " + i + " is: " + factorial);
            }
            return factorial;

        }
    }

