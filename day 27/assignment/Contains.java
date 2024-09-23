class Contains {
    // The contains() method checks whether a string contains a sequence of characters.
    public static void main(String[]args){
        String str ="hello world !";
        boolean containsSubString1 = str.contains("h");
        boolean containsSubString2 = str.contains("Java");

        System.out.println(containsSubString1);
        System.out.println(containsSubString2);  
    }
    
}
