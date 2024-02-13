
class doubledemo {
    public static void main(String[] args) {
        double a = 10d;
        double b = -12d;

        System.out.println("conversion value in byte is :  "+(byte) (a+b));
        System.out.println("conversion value in int is :  "+(int) (a-b));
        System.out.println("conversion value in long  is :  "+(long) (a*b));
        System.out.println("conversion value in short is :  "+(short) (a/b));
        System.out.println("conversion value in float is :  "+(float) (a%b));
        System.out.println("conversion value in char is :  "+(char) (a%b));
        System.out.println("mixed operation on long -> value :  "+(long) (a*b+a-b));
    
}
  }
