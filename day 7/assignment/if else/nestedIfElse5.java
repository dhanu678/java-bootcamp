class nestedIfElse5 {
     public static void main(String[] args) {
        int score = 89;

        if (score >= 90) {
            System.out.println("A");
        } else {
            if (score >= 80) {
                System.out.println("B");
            } else {
                System.out.println("C");
            }
        }
    }
}
    