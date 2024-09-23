 class ContentEquals {
    public static void main(String[] args) {
        
        // Checks whether a string contains the exact same 
        //sequence of characters of the specified CharSequence or StringBuffer
    
         String name = "Hello wrold";
         String name2 = "Java";
         String name3 = "Hello wrold";


        //  boolean ContentEqual = name.contentEquals(name3);// true
         boolean ContentEqual = name.contentEquals(name2);//false
         System.out.println(ContentEqual);
    }

    
}
