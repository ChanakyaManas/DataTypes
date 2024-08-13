import java.util.Scanner;

public class Test{
    public static void main(String[] args) {
        Student s=new Student();
        Scanner in=new Scanner(System.in);
        s.id=in.nextInt();
        s.name=in.next();
        System.out.println(s.id+","+s.name);
    }
}
