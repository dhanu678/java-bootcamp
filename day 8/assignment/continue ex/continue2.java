class continue2{
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            int result = 3 * i;
             if (i == 5) {//skip 2 *5
                continue;
            }

            System.out.println("3 * " + i + " = " + result);
        }
    }
}
