class continue5 {
    public static void main(String[] args) {
      // printing alphabet A TO G
      for (char ch = 'A'; ch <= 'G'; ch++) {
        if (ch == 'B') {
          continue;
        }
        System.out.println("Character: " + ch);
      }
    }
  }
    