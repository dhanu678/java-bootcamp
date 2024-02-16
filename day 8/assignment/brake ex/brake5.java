// printing alphabet A TO G
class brake5 {
    public static void main(String[] args) {
       for (char ch = 'A'; ch <= 'G'; ch++) {
            System.out.println("Character: " + ch);
            if (ch == 'D') {
                System.out.println("Breaking the loop  " + ch);
                break;
            }
        }
    }
}


