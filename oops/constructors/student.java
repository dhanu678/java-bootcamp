public class student {
    String name;
    int roll;
    String address;
    float marks;
    long mobile;
    String id;
    
    student(){

    }
student(int roll,String name){
    this.name = name;
    this.roll = roll;
}
student(String name,int roll,String address,float marks){
    this.name = name;
    this.roll = roll;
    this.address=address;
    this.marks = marks;
    this.mobile = mobile;
    this.id = id;
}
void printObject(){
    System.out.println("------------------------------------------------------");
    System.out.println(this.name);
    System.out.println(this.roll);
    System.out.println(this.address);
    System.out.println(this.marks);
    System.out.println(this.mobile);
    System.out.println(this.id);

}
public static void main(String[] args) {
student s1= new student();
s1.name = "dhanashree";
s1.roll = 34;
s1.printObject();
}
}
