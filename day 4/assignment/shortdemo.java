package day4.assignment;

public class shortdemo {
    public static void main(String[] args) {
       short a =12;
       //short b =-1.2; 
       short b =18;

    System.out.println("conversion value in byte is :  "+(byte) (a+b));
    System.out.println("conversion value in int is :  "+(int) (a-b));
    System.out.println("conversion value in long  is :  "+(long) (a*b));
    System.out.println("conversion value in float is :  "+(float) (a/b));
    System.out.println("conversion value in double is :  "+(double) (a%b));
    System.out.println("conversion value in char is :  "+(char) (a%b));
    System.out.println("mixed operation on long -> value :  "+(long) (a*b+a-b));
    
}

}
