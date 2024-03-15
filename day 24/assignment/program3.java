public class program3 {
//     **Transpose the Matrix**:
//    Write a function to transpose a given 2D matrix. Transposing a matrix means to swap its rows with its columns.
// 

    public static void main(String[] args) {
        int[][] arr1 = {
            {100, 20},
            {30, 40}
        };

        int[][] transpose = new int[2][2];
        
     
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                transpose[i][j] = arr1[j][i];
            }
        }

        System.out.println("Without transpose:");
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Printing Matrix After Transpose:");
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println(); 
        }
    }
}

