 
//  for pattern:
//  1 1 1 1 1 
//  2 2 2 2
//  3 3 3
//  4 4
//  5
 class pattern3 {
    public static void main(String[]args){
         for (int i = 0 ; i<5; i++){
            for(int j = 0;j<5-i ;j++){
               System.out.print(i+1+" ");
            }
            System.out.println();
         }
    }
}
