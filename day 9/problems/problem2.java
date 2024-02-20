// Write a java program to encrypt a grade by, adding 8 to it. Decrypt it to show the correct grade
 import java.util.Scanner;
 class problem2 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter any character to encrypt -> ");
        char grade = input.next().charAt(0);
        
        System.out.println("before encryption -> " + grade);
        char encrypt = (char) (grade + 8);
        System.out.println("after encryption -> " + encrypt);

        char decrypt = (char) (encrypt - 8);
        System.out.println("after decryption -> " + decrypt);

    }
}
//Enter any character to encrypt -> 
// A
// before encryption -> A
// after encryption -> I
// after decryption -> A