 class continue3 {
    public static void main(String[] args) {
         // reverse countdown number
         for (int i = 10; i >= 0; i--) {
            
            if (i > 2) {
                continue; 
            }

            System.out.println("Countdown starts: " + i);
        }
    }
}

