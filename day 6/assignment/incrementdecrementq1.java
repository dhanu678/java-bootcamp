 class incrementdecrementq1 {
    public static void main(String[]args){
        int i = 11;
        i = i++ + ++i; //11 +13
        System.out.println(i);//24
    

    }
    
}

 
//   i =11
//    i = i++ + ++i;
//    i++ =  Current value of ‘i’ is used and then it is incremented by 1.
//    ++i=  First ‘i’ is incremented by 1 and then it’s value is used.
//   so i ++ = 12  (but this is after increment so =11)
//     so  ++i = 13
//     so 11+13 = 24    
   