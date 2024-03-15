 class Byte {
     
    public static void main(String[]args){
        byte[][] arr = new byte[2] [2];
           // elemnts of first row
           arr[0][0] =45 ;
           arr[0][1] = 51;

        //    second row :

          arr[1][0] = 55;
          arr[1][1] = 45;

          for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();

        }

    }
    
}
