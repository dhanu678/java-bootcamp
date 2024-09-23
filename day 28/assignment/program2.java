class program2 {
    public static void main (String[] args){

        String name = "KARAN";
        isLower(name);
 
    }
    static void isLower(String name){
        String loweString =" ";
        for(int i =0; i < name.length();i++){
            char c = name.charAt(i);
            if(c >= 'A' && c <= 'Z'){
                c = (char) (c + 32);
            }
            loweString +=c;
        }
        System.out.println(loweString);


    }
    
}
    

