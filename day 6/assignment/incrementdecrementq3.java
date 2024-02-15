public class incrementdecrementq3 {
    public static void main(String[]args){
        int i = 0;
        i = i++ - --i + ++i - i--;
        System.out.println(i);//0

    }

}
 
//i++ = 0 (after->1), --i= 1-1 =0 ,++i = 1+0=1,i--= 1(after -> 0)
// i = 0-0+1-1=0
