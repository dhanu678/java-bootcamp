package day4.assignment;
public class chardemo {
        public static void main (String[] args){
    
            char a = '9';
            char b = '8';
    
            System.out.println("conversion value in byte is :  "+(byte) (a+b));
            System.out.println("conversion value in short is :  "+(short) (a-b));
            System.out.println("conversion value in long  is :  "+(long) (a*b));
            System.out.println("conversion value in float is :  "+(float) (a/b));
            System.out.println("conversion value in double is :  "+(double) (a%b));
            System.out.println("mixed operation on long -> value :  "+(long) (a*b+a-b));
    
        }
    }
    

