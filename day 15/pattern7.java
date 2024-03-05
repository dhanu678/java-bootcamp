// pattern :
// 7 6 5 4 3 2 1 
// 7 6 5 4 3 2
// 7 6 5 4 3
// 7 6 5 4
// 7 6 5
// 7 6
// 7
class pattern7 {
     public static void main(String[]args){
        for (int i = 0;i<7;i++){
            for (int j = 0;j<7-i;j++){
                System.out.print(7 -j +" ");
            }
            System.out.println();
        }
     }    
}
