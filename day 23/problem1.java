 class problem1 {

        public static void main (String[] args){
            int [] arr = { 101, 102, 103, 102, 101};
    
            isPalindrome1(arr);
    
           
        }
    
        static int[] reverse(int[] arr){
            int[] reversed = new int[arr.length];
    
            for(int i = 0; i < arr.length; i++){
                reversed[arr.length - 1 - i] = arr[i];
            }
            return reversed;
        }
    
        static void isPalindrome1(int[] arr){
            int[] reversed = reverse(arr);
            for(int i = 0; i < arr.length; i++){
                if(arr[i] != reversed[i]){
                    System.out.println(reverse(arr));
                } 
                
            }
        }
    }
    

