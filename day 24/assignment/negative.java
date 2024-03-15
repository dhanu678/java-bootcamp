class negative {

    public static void main(String[] args) {
        int[][] arr = {
                { -1, 2 },
                { -4, 5 }
        };

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i][j] < 0) {

                    System.out.println("Negative number found: " + arr[i][j]);
                }
            }

        }
    }
}