class NestedifElse1 {
    public static void main(String[] args) {
        int a = 20;
        int b = 25;

        if (a > 10) {
            System.out.println("A is greater than 10");
            if (b > 15) {
                System.out.println("B is greater than 15");
            } else {
                System.out.println("B is not greater than 15");
            }
        } else   {
            System.out.println("A  and b are not  equal");
        }
    }
}
    

