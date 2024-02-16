 // reverse countdown number
 class brake3 {
     public static void main(String[] args) {
        for (int i = 10; i >= 0; i--) {
            System.out.println("Countdown starts: " + i);
               if (i <= 2) {//brake
                System.out.println("Breaking the loop at  " + i);
                break;
            }
        }
    }
}

