 class nestedIfElse2 {
    public static void main(String[] args) {
 
        int n1 = 150, n2 = 180, n3 = 190;
 
        if (n1 >= n2) {
            if (n1 >= n3)
                System.out.println("Student height: " + n1 + "  tallest.");
            else
                System.out.println("Student height: " + n3 + " tallest.");
        } else {
            if (n2 >= n3)
                System.out.println("Student height: " + n2 + " tallest.");
            else
                System.out.println("Student  height: " + n3 + "  tallest.");
        }
    
}
}
