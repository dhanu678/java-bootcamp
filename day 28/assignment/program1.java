
class program1 {
    public static void main (String[] args){

        String name = "dhanashree";

       isUpper(name);
    }

    static void isUpper(String name){
        String upperString = "";

        for(int i = 0; i < name.length(); i++){

            char c = name.charAt(i);
            if(c >= 'a' && c <= 'z'){
                c = (char) ( c-32);
            }
            upperString += c;
        }
        System.out.println(upperString);

    }
    
}
