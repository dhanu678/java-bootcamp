// nth number
public class question4 {
  
    public static void main(String[] args) {
    
        int n = 12; // Change this to the desired value of n
        int first = 0;
        int second = 1;
        int next;
    
        for (int i = 0; i < n - 1; i++) {
            next = first + second;
            first = second;
            second = next;
        }
        
        System.out.println("The " + n + "th number in the Fibonacci sequence is: " + first);
    }
}

    

