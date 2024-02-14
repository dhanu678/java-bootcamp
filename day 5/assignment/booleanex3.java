    // OR(||) example
    //True    True  =  True
    //True    False  = True
    //False   True    =True
    //False   False   =False
class booleanex3 {
    
    public static void main (String[] args){
      
        byte a = 50;
        byte b = 10;
        System.out.println((a < b) || (a > b)); 
        System.out.println((a < b) || (a >=b));  
        System.out.println((a > b) || (a != b)); 
        System.out.println((a ==b) || (a <b));   
    }
}
    
