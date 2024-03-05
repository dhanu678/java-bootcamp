//  for this pattern
// 7                *2 = 2(2 times 7)
// 7  7             *2 = 4(4 times 7)
// 7  7  7          *2 = 6 
// 7  7  7  7       *2 = 8
// 7  7  7  7  7    *2 = 10
  
 class pattern5 {
    public static void main (String[] args){
        int n = 7;
        for(int i = 0 ; i < n; i++){
            for(int j = 0; j < i *2; j++){// we are giving *2 condtion 
                System.out.print(" 7 ");
            }
            System.out.println();
        }
    }
}





