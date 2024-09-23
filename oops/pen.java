class pen {
    int length = 10;
     String color = " blue";
      
   //   three methods defined within the pen class: write(), weapon(), and game(). 
   //   Each method prints a different message.
     void write(){
        System.out.println("Write with this pen");
     }
     void weapon(){
        System.out.println("Use it as a  game");  
     }
     void game(){
      System.out.println(" Use me as a game");
     }
     public static void main(String[]args){
      pen p1 = new pen();
      p1.write();

      System.out.println(p1.length);
      System.out.println(p1.color);

      pen p2 = new pen();
       p2.length = 50;
      p2.color = "Pink";
      System.out.println(p2.length);
      System.out.println(p2.color);

     }
    
}
