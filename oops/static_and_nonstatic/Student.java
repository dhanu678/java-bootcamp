

public class Student {
    String name ="dhanashree";
    int roll;

    void greetings(){
        System.out.println("Hii " + name + "...!");

    }
    static void printObject(){
        Student s1 = new Student();
        System.out.println(s1.name);
        s1.greetings();
    }
    public static void main(String[] args) {
        
        printObject();
    
    }
    
}
