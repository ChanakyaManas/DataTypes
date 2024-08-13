import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Student t1=new Student();
        Student t2=new Student();
        Scanner commen=new Scanner(System.in);
        System.out.println("enter the full name");
        t1.name=commen.next();
        System.out.println("enter the roll no");
        t1.rollno=commen.nextInt();
        System.out.println("enter the phone no ");
        t1.phoneno=commen.nextDouble();
        System.out.println("enter the full name");
        t2.name=commen.next();
        System.out.println("enter the roll no");
        t2.rollno=commen.nextInt();
        System.out.println("enter the phone no ");
        t2.phoneno=commen.nextDouble();
    }
            
        }
        
    
    