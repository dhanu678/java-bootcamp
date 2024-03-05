
// pattern:
// 1
// 01
// 101
// 0101
// 10101
class pattern5 {
    public static void main(String[]args){
        for(int i = 0; i<7;i++){
            for(int j = 0; j<=i;j++){
                System.out.print((char)(i + 'A') + " ");
            }
            System.out.println();
        }
    }
    
}
