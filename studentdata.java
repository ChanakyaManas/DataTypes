import java.util.Scanner;

public class studentdata {
    public static void main(String[] args) {
        student A=new student();
        Scanner in=new Scanner (System.in);
        System.out.println("Enter your name");
        String Name=in.next();
        System.out.println("Enter your roll number");
        byte rollnumber=in.nextByte();
        System.out.println("Enter your phone number");
        long pno=in.nextLong();
        System.out.println("Enter your Gender");
        char gender=in.next().charAt(0);
        System.out.println("Enter your cgpa");
        float cgpa=in.nextFloat();
        System.out.println("Enter your points");
        double points=in.nextDouble();
        System.out.println("Enter your serial number");
        short serialno=in.nextShort();
        System.out.println("Enter your status");
        boolean status=in.nextBoolean();
        System.out.println(Name +" "+cgpa + status);



    }
    
}

