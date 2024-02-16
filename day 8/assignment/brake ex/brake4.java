 //  even number:
 class brake4 {
    public static void main(String[] args) {
        for (int i = 2; i <= 20; i += 2) {
            System.out.println("Even Number: " + i);
             if (i >= 10) {//brake after 10
                System.out.println("Breaking the loop " + i);
                break;
            }
        }
    }
}

    
