public class incrementdecrementq19 {
    public static void main(String[] args) {
        int i = 0, j = 0;
         
        System.out.println(--i * i++ * ++j * j++);//1
    }
}
  
// solution =
// --i =1
// i++=0(1)
// ++j =1
// j++ = 1