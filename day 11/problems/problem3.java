// Q. Write a program to check whether a character is vowel or not
//  (both ways using if-else and using switch case statement)


 class problem3 {
     public static void main(String[] args) {
         // Vowel = a,e,i,o,u

         String vowel = "aeiou";
         char name = 'u' ;
         if (vowel.indexOf(name) != -1)  //This line checks if the character name exists within the string vowels
         {
             System.out.println("This is vowel");
         }
         else{
             System.out.println("This is not a vowel");
         }
 
        //  switch (name){
        //      case 'a':
        //          System.out.println("This is vowel");
        //          break;
        //      case 'e':
        //          System.out.println("This is vowel");
        //          break;
        //      case 'i':
        //          System.out.println("This is vowel");
        //          break;
        //      case 'o':
        //          System.out.println("This is vowel");
        //          break;
        //      case 'u':
        //          System.out.println("This is vowel");
        //          break;
             
        //      default:
        //          System.out.println("This is not vowel");
         }
     }
 