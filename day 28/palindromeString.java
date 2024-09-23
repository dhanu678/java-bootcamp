 class palindromeString {
    public static void main(String[]args){
        String str = "xyzyx";
        System.out.println(ispalindrome(str));
       
    }
    static String reverse(String str){
        String newString="";
        for(int i = str.length()-1 ;i>=0;i--){
            newString = newString+str.charAt(i);
        }
        return newString;
    }
       static  boolean ispalindrome(String str){
        String newString="";
        for(int i = str.length()-1 ;i>=0;i--){
            newString = newString+str.charAt(i);
       }
       if(newString.equals(str)){
        return true;
       }
       else{
        return false;
       }
    
}
 }
