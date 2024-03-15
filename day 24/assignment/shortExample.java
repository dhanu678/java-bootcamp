class shortExample {
   public static void main(String[] args) {
            short[][] arr = new short[2][2]; 
    
            // 1st row:
            arr[0][0] = -24; 
            arr[0][1] = 68;
    
            // 2nd row:
            arr[1][0] =-98;
            arr[1][1] = 0; 
            
            for (short i = 0; i < arr.length; i++) {
                for (short j = 0; j < arr[i].length; j++) { 
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
    
    

