 class ternaryoperator5 {
    public static void main(String[] args) {
        int month = 7;
          // (condition) ? code : code;
          String season = (month >= 3 && month <= 5) ? "Spring" : 
                         (month >= 6 && month <= 8) ? "Summer" :
                         (month >= 9 && month <= 11) ? "Fall" : "Winter";
        System.out.println( season);
    }
}

