import java.util.Scanner;

public class Test{
    public static void main(String[] args) {
        Student student1=new Student();
        Student student2=new Student();
        Scanner in=new Scanner(System.in);
        
        System.out.println("Enter Student id");
        student1.id=in.nextInt();
        System.out.println("Enter Student name");
        student1.Name=in.next();
        System.out.println("Enter Student mobile number");
        student1.mno=in.nextLong();
        System.out.println("Enter Student CGPA");
        student1.cgpa=in.nextFloat();
        System.out.println("Enter Student score");
        student1.score=in.nextInt();
        System.out.println("Enter Student status");
        student1.status=in.nextBoolean();


        System.out.println("id:"+student1.id+"Name:"+student1.Name+"Mobile no:"+student1.mno);

    }
}
