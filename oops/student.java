 class student {
    // declare three instance variables-->
    String name;
    int roll;
    float marks;
    // constructor method without any parameters-->
    student(){
        name ="sakshi";
        roll = 10;

    }
    // constructor with parameters -->
    student(String name1,int roll1){
        name = name1;
        roll = roll1;
    }
     // constructor with parameters -->
    student(String name1,int roll1,float marks1){
        name = name1;
        roll = roll1;
        marks = marks1;


    }
    // method printobject() prints the values of name, roll, and marks variables of a Student object.
    int printobject(){
        System.out.println(name);
        System.out.println(roll);
        System.out.println(marks);
        return 0;
    }
    public static void main(String[]args){
        student s1 = new student();
        
        int methodCall =s1.printobject();//This line calls the printobject() method on the s1 object to print its details
        System.out.println("---------------------");
        student s2 = new student("dhanashree",34,45.28f);
        s2.printobject();


    }

    
}
