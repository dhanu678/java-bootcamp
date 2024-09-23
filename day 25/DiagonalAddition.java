class DiagonalAddition {
    public static void main(String[] args) {
        int[][] arr = {
                { 1, 5, 8 },
                { 4, 9, 9 },
                { 10, 3, 5 },
        };
        System.out.println(diagonalSum(arr));

    }

    static int diagonalSum(int[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i == j) {
                    sum += arr[i][j];
                }
            }

        }
        return sum;
    }

    static void printArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
        }
        System.out.println();
    }

}
