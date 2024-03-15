 class SumArray {
  
    public static void main(String[] args) {  
        int[][] arr1 = {
            {5, 6},
            {7, 8}
        };

        int[][] arr2 = {
            {4, 6},
            {4, 8}
        };

        int[][] ans = new int[2][2];
        
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                ans[i][j] = arr1[i][j] + arr2[i][j];
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }
    }
}