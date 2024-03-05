

public class question6 {
    public static void main(String[] args) {
    
        int n = 12; // Change this to the desired value of n
        int first = 0;
        int second = 1;
        int next;
        int sum = first; // Initialize sum with the first Fibonacci number
        
        for (int i = 1; i < n; i++) {
            next = first + second;
            sum += next; // Add the current Fibonacci number to the sum.
            first = second;
            second = next;
        }
        
        System.out.println("The sum of the first " + n + " Fibonacci numbers is: " + sum);
    }
}
    

