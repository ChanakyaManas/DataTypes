import java.util.Scanner;
public class Test {

    
public static void main(String[]args){
Student t1=new Student();
        Student t2=new Student();
        Scanner basic=new Scanner(System.in);
        System.out.println("enter the name");
        t1.name=basic.next();
        System.out.println("enter the roll no");
        t1.rollno=basic.nextInt();
        System.out.println("enter the mobile no");
        t1.mobileno=basic.nextDouble();
        System.out.println("enter the Student id");
        t1.id=basic.nextByte();
        System.out.println("enter the name");
        t2.name=basic.next();
        System.out.println("enter the roll no");
        t2.rollno=basic.nextInt();
        System.out.println("enter the mobile no");
        t2.mobileno=basic.nextDouble();
        System.out.println("enter the student id");
        t2.id=basic.nextByte();

    }
}