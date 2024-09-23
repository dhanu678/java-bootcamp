class rohini {
    int height;
    int weight;
    
    rohini(){

    }
    rohini(int height,int weight ){
        this.height = height;
        this.weight = weight;
    } void dance(){
        System.out.println("Rohini can dance");
    }

    void cook(){
        System.out.println("Rohini can cook");
    }
    public static void main(String[] args){
        rohini r1 = new rohini(100, 200);
        r1.height = 100;
        r1.dance();
        rohini r2 = new rohini();
        r2.height = 1000;
        r2.dance();
    }


}
