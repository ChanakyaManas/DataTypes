import java.util.Scanner;

public class testS {
    public static void main(String[] args) {
        studentshoeb x= new studentshoeb();
        studentshoeb x1= new studentshoeb();
        Scanner sm= new Scanner(System.in);
        System.out.println("enter your id ");
        int id = sm.nextInt();
        System.out.println("enter your name ");
        String name = sm.next();
        System.out.println("enter yor gender");
        char gender = sm.next().charAt( 0);
        System.out.println("enter marks obatined");
        float marks = sm.nextFloat();
        System.out.println("enter youe mobile number");
        long num = sm.nextLong();
        System.out.println("enter decimal value of marks : (accurate value) ");
        double data = sm.nextDouble();
        System.out.println("enter any one option : pass==true  : fail==false");
        boolean pass = sm.nextBoolean();
        System.out.println("enter your age ");
        byte age = sm.nextByte();
        System.out.println("enter your weight ");
        short weight = sm.nextShort();

        System.out.println("id :"+id+ ",name :" +name+", gender :"+gender+", marks : "+marks+", mobile no :"+num+", accurate marks :"+data+", status :"+pass+", age :"+age+", weight : "+weight );





    }
    
}
