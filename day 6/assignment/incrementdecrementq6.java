public class incrementdecrementq6 {
    public static void main(String[] args) {
        int a=1, b=2;
         
        System.out.println(--b - ++a + ++b - --a);//0
    }
}


//a = 1 ,b =2
//--b -> 1(2-1)
//++a -> 2(1+1)
//++b -> 2(1+(b)=1+1=2)
//--a->1(2-1)
//1-2+2-1=0
