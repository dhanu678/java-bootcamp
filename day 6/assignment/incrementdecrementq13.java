class incrementdecrementq13 {
    public static void main(String[] args) 
    {
        int x = 001, y=010, z=100;
         
        int i = --x + y++ - z-- - --z + ++y - --x + y-- - --x;
         
        System.out.println("x="+x);//-2
        System.out.println("y="+y);//11
        System.out.println("z="+z);//98
        System.out.println("i="+i);//167
    }
}
     

// solution :
// --x = 1-001=0
// y++ = 010(after increment it will be 11)
// z-- = 100(after decrement it will be 99)
// --z = 99-1=98
// ++y = 1+11=12
// --x = -1
// y-- = 12(after post decrement it will be 11)
// --x = -1-1=-2)
//  i =  --x + y++ - z-- - --z + ++y - --x + y-- - --x;
//  0 + 10 – 100 – 98 + 12 – (-1) + 12 – (-2)
//  -167


