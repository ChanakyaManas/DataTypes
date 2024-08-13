import java.util.Scanner;

public class Test{
    public static void main(String[] args) {
        Student t1 = new Student();
        Student t2 = new Student();
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter  the name:");
        t1.name = in.nextLine();  
        
        System.out.println("Enter id:");
        t1.id = in.nextInt();
        
        System.out.println("Enter mobile number:");
        t1.mobilenum = in.nextLong();
        
        System.out.println("Enter CGPA:");
        t1.cgpa = in.nextDouble();

        System.out.println("Enter name:");
        t2.name = in.nextLine();  
        
        System.out.println("Enter id:");
        t2.id = in.nextInt();
        
        System.out.println("Enter mobile number:");
        t2.mobilenum = in.nextLong();
        
        System.out.println("Enter CGPA:");
        t2.cgpa = in.nextDouble();
        
        System.out.println("id: " + t1.id + " Name: " + t1.name + " Mobile Number: " + t1.mobilenum + " CGPA: " + t1.cgpa);
        System.out.println("id: " + t2.id + "Name: " + t2.name + " Mobile Number: " + t2.mobilenum + " CGPA: " + t2.cgpa);

    }
}
public class Student{
    int id;
    String name;
    long mobilenum;
    double cgpa;
    boolean gender;
}
