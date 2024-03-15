class longExample {
    public static void main(String[] args) {
        long[][] arr = new long[2][2]; 

        // 1st row:
        arr[0][0] = -24l; 
        arr[0][1] = 68l;

        // 2nd row:
        arr[1][0] =-98l;
        arr[1][1] = 0; 
        
        for (int i= 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) { 
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}



