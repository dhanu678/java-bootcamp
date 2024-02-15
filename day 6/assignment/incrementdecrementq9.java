class incrementdecrementq9 {
    public static void main(String[] args) 
    {
        int m = 0, n = 0;
         
        int p = --m * --n * n-- * m--;
         
         System.out.println(p);//1
    }
}
    // solution:
//  -m-m = 0-1= -1
// --n = 0-1 = -1
// n--= -1(0)
// m--= -1(-2)
//  -1*-1*-1*-1
//1
  