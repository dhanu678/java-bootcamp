// for pattern 
//    0
// *     0
// **    1
// ***   2
// ****  3
// ***** 4

public class pattern2 {
    public static void main (String[]args){
        for (int i = 0 ; i <5 ;i++){
            for (int j =0; j< i+1  ;j++ ){
                System.out.print("*");
             }
             System.out.println();  
        }

    }
}
