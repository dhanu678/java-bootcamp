 class pattern1 { // in method format
    
    public static void main (String[] args){
        int n = 5;
        pattern(n);

    }
    static void pattern(int n){
        for(int i = 0; i <=n ; i++){
            for(int j = 0; j <= 5; j++){
            System.out.print("* ");
            }
                    System.out.println();

        }
    }
}
