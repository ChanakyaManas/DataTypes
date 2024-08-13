import java.util.Scanner;

public class Test{
    public static void main(String[] args) {
        student s=new student();
        Scanner in=new Scanner(System.in);
        System.out.println("Enter your name");
        String name=in.next();
    System.out.println("Enter your mbl");
        int mbl=in.nextInt();
        System.out.println("Enter your gender");
        char gender=in.next().charAt(0);
        System.out.println("Enter your score");
        double score=in.nextDouble();
        System.out.println("Enter your cgpa");
        float cgpa=in.nextFloat();
        System.out.println("Enter your rollno");
        byte rollno=in.nextByte();
        System.out.println("Enter your boolean");
        boolean num=in.nextBoolean();
        System.out.println(mbl+","+name);




    }
}
