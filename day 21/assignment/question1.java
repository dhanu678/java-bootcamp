// Sum of Array Elements: Write a program to calculate the sum of all elements in an array.
class question1 {
    public static void main(String[]args){
        int[]arr = {1,2,4,5,6};
        
        int sum = 0;
        for(int i = 0; i<arr.length;i++){
            sum+=arr[i];
        }
        System.out.println( " the sum of the array "+sum);
        
    }

    
}
