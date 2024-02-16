class forloop9 {// imp program of printing pattern of stars
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}
 

// output :
// * 
// * * 
// * * * 
// * * * * 
