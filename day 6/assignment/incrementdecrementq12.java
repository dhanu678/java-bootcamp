public class incrementdecrementq12 {
    public static void main(String[] args) 
    {
        int m=1010, n=1010;
         
        System.out.println(m++ / ++n * n-- / --m); //0
    }
}

//  solution =
//  m = 1010, n = 1010
//  m++ = 1010  (after post increment it will be 1011)
//  ++n = 1+1010= 1011
//  n-- = 1011 (after post decrement =1012)
//  --m = 1011-1 = 1010
//  m++ / ++n * n-- / --m
//  1010/1011*1011/1010
//  = 0 