 class charExample {
    public static void main(String[]args){
        int[][]arr ={
            {'A','B' ,'C'},
            {'C','D','E'},
            { 'F','G','H'}
        };
        for (int i = 0;i<arr.length;i++){
            for(int j = 0;j< arr.length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    
}
