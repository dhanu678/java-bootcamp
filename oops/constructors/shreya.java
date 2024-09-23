 class shreya {
    long money;
    String car;

    shreya(long money, String car) {
        this.money = money;
        this.car = car;
    }

    shreya() {
        this.money = 10000000000l;
        this.car = "BMW";
    }

    public static void main(String[] args) {
        // long money = 10000000000l;
        // String car = "BMW";
        shreya s1 = new shreya();

        System.out.println(s1.money);
        System.out.println(s1.car);
    }
    
}
