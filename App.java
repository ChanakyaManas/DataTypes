import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        project student1 =new project();
        project student2 =new project();
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the value");
      student1.num=sc.nextInt();
      System.out.println(student1.num);
      System.out.println("enter the bach name");
      student1.bach=sc.nextShort();
      System.out.println(student1.bach);
      System.out.println("enter the pointes");
      student1.points=sc.nextDouble();
      System.out.println(student1.points);
      System.out.println("enter the cgpa ");
      student1.cgpa=sc.nextFloat();
      System.out.println(student1.cgpa);
      System.out.println("enter the name ");
      student1.name=sc.next();
      System.out.println(student1.name);
      System.out.println("enter the gender");
      student1.gender=sc.next().charAt(0);
      System.out.println(student1.gender);
      System.out.println("enter the rank");
      student1.rank=sc.nextByte();
      System.out.println(student1.rank);
      System.out.println("enter the status pass-fail");
      student1.pass=sc.nextBoolean();
      System.out.println(student1.pass);
      
      System.out.println("enter the value");
      student2.num=sc.nextInt();
      System.out.println(student2.num);
      System.out.println("enter the bach name");
      student2.bach=sc.nextShort();
      System.out.println(student2.bach);
      System.out.println("enter the pointes");
      student2.points=sc.nextDouble();
      System.out.println(student2.points);
      System.out.println("enter the cgpa ");
      student2.cgpa=sc.nextFloat();
      System.out.println(student2.cgpa);
      System.out.println("enter the name ");
      student2.name=sc.next();
      System.out.println(student2.name);
      System.out.println("enter the gender");
      student2.gender=sc.next().charAt(0);
      System.out.println(student2.gender);
      System.out.println("enter the rank");
      student2.rank=sc.nextByte();
      System.out.println(student2.rank);
      System.out.println("enter the status pass-fail");
      student2.pass=sc.nextBoolean();
      System.out.println(student2.pass);



      
    }
}
