import java.util.Scanner;

public class StudentInfo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Name of student : "); 
        String name = sc.nextLine();
        System.out.println("Age: "); 
        byte age = sc.nextByte();
        System.out.println("Roll No: ");
        short roll = sc.nextShort();
        System.out.println("ID: "); 
        int id = sc.nextInt();
        System.out.println("Phone number: ");
        long phone = sc.nextLong();
        System.out.println("GPA: "); 
        float gpa = sc.nextFloat();
        System.out.println("CGPA: "); 
        double cgpa = sc.nextDouble();
        System.out.println("Grade in A,B,C,F: ");
        char grade = sc.next().charAt(0);
        System.out.println("Full-time (true/false): "); 
        boolean fullTime = sc.nextBoolean();
        
        System.out.println("student name is ::" + name+ " ,age of student is :: " + age + " roll number of student :" + roll + "student id " + id + ", " + phone + ", " + gpa + ", " + cgpa + ", " + grade + ", " + fullTime);
        
    
    }
}
