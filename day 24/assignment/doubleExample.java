class doubleExample {
    
        public static void main(String[] args) {
            double[][] arr = new double[2][2];
    
            // 1st row:
            arr[0][0] = -24.0;
            arr[0][1] = 68.0;
    
            // 2nd row:
            arr[1][0] = -98.0;
            arr[1][1] = 0.0;
        
    
            for (int i = 0;i<arr.length;i++){
                for(int j = 0;j< arr.length;j++){
                    System.out.print(arr[i][j]+" ");
                }
                System.out.println();
            }
        }
    }
        
    
    