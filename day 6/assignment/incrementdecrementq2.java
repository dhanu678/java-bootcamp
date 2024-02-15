class incrementdecrementq2{
    public static void main(String[] args) {
        int a=11, b=22, c;
         
        c = a + b + a++ + b++ + ++a + ++b;
         
        System.out.println("a="+a); //11 -> a++=11 post increment will 12-> ++a=1+12=13
        System.out.println("b="+b);//22 -> b++=22 after incement it will be 23 -> ++b =1+23=24
        System.out.println("c="+c); //11+22 +11+22+13+24 =103
 //a +b =11+22 , a++= 11(after increment =12),b++ =22 (after increment=23),++a =1+12  =13 (because of incremet)
 //++b =1+23=24 so 11+22 +11+22+13+24 =103

    }
}

