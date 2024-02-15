class nestedIfElse3 {
    public static void main(String[] args) {
    int a = 6;
    int b = 6;
    int c = 6;

    if (a == b) {
        if (a == c) {
            
            System.out.println("Equal");
        } else {
           
            System.out.println("Not equal");
        }
    } 
    else {
       
        System.out.println("Not equal");
    }
}
}