

public class question5 {
    public static void main (String[] args){
    
        int n= 11;
        int first = 0;
        int second = 1;
        int  next;

        for(int i = 0 ; i <n ; i++){
            next = first + second;
            System.out.println(first + "");
            first = second;
            second = next;
        }
    }
}

