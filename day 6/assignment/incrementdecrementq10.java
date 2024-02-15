class incrementdecremnetq10 {
    public static void main(String[] args)  {
        int a=1;
         
        a = a++ + ++a * --a - a--;
         
      
        System.out.println(a);//5
    }
}

// solution //
//  a = 1
//  a++= 1 (after post increment it will be 2)
//  ++a = 1+2 = 3
//  --a = 3-1 = 2
//  a-- = 2 (after post decremnet it will be 1)
//  a = a++ + ++a * --a - a--;
//       1  +  3  *  2  -  2 =
//       1+6-2
//       5