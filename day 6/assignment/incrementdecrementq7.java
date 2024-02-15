public class incrementdecrementq7 {
    public static void main(String[] args) 
    {
        int i=19, j=29, k;
         
        k = i-- - i++ + --j - ++j + --i - j-- + ++i - j++;
         
        System.out.println("i="+i);//19
        System.out.println("j="+j);//29
        System.out.println("k="+k);//-20
    }
}

//i--= 19(after increment->18)
//i++ = 18(after increment ->19)
//--j = 28
//==j = 29
//--i = 18(19-1)
//j--=29(after incremnt->28)
//++i =19(18+1)
//j++=28(after increment ->29)
//i-- - i++ + --j - ++j + --i - j-- + ++i - j++;
// 19-18+28-29+18-29+19-28 =-20