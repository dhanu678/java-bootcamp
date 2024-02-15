 class nestedIfElse4 {
    public static void main(String[] args) {
        int num = 27;
        if (num % 3 == 0) {
            if (num % 9 == 0) {
                System.out.println("num is divisible by 3 and 9");
            } else {
                System.out.println("number is only divisible by 2");
            }
        } else {
            System.out.println("number is bot divisible by 2");
        }
    }
}
