// Find Maximum Element: Write a program to find the maximum element in an array.
 class question2 {
    public static void main(String[]args){
        int[]array={12,45,56,102};
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
                System.out.println(array[i]+" ");
            
        }
        System.out.println("Maximum value in the array: " + max);
    }
    
}
