
import java.util.Arrays;

public class soham {
    String name;
    String[]friends;
    soham(){

    }
    soham(String name,int friendsCount ){
        this.name = name;
        this.friends = new String[friendsCount];

    }
    static void printObject(soham s){
        System.out.println("*********************************************************************");
        System.out.println("The name is: " + s.name);
        System.out.println(s.name + " has " + s.friends.length + " friends");
       System.out.println("Friends: \n" + Arrays.toString(s.friends));
    }
    public static void main(String[] args) {
        soham s1 = new soham("S1", 5);
        soham s2 = new soham("S2", 0);
        soham s3 = new soham("S3", 10);
        soham s4 = new soham("S4", 15);
        soham s5 = new soham("S5", 20);
        printObject(s1);
        printObject(s2);
        printObject(s3);
        printObject(s4);
        printObject(s5);
    }
} 


