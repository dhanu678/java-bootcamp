class Method2{

    public static void main (String[] args){
        
        //Method 1
       wishes("dhanashree");
    
       //method 2 
       String name = "shreya";
       wishes(name);
       
       //method 3
       String friend = "sakshi";
       wishes(friend);
    }

    static void wishes(String name){

        System.out.println("how are you " + name);
    }
}