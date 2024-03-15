 class problem4 {
    public static void main(String[]args){
        // int sum = 0;
        // for (int i = 2 ; i <= 100 ; i+= 2){
        //      sum += i;
        
        // }
        // System.out.println("Sum of even numbers between 1 and 20: " + sum);
        EvenSum();
    }
     public static   void  EvenSum(){
        int sum = 0;

        for (int i = 2 ; i <= 100 ; i+= 2){
             sum += i;
        
        }
        System.out.println("Sum of even numbers between 1 and 20: " + sum);

     }
    
    
}
