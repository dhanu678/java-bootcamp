 class SwappingNumbers {
    public static void main(String[]args){
        int a = 100;
        int b = 200;
        System.out.println("before swapping : a ="+a +",b="+b);
        // swap(a,b);
        //  a = a+ b;
        //  b = a-b;
        //  a = a-b; 
        //    or
        a = a*b;
        b = a/b;
        a = a/b;

         System.out.println("after swapping: a ="+a+", b ="+b);


        // int temp = a;  temp veriable
        // a = b;
        // b = temp;
        // System.out.println("after swapping: a ="+a+", b ="+b);



    }
    
}
