//  for this pattern
//   *
//   *   *
//   *   *   *
//   *   *   *   *
//   *   *   *   *   *
 class pattern3 {
    public static void main(String[] args) {
        for (int i = 0; i < 6; i++) {//rows
            for (int j = 0; j < + i; j++) {//column
                System.out.print("  * ");
            }
            System.out.println();
        }
    }
}
