import java.util.Scanner;

public class App {
    public static void main(String[] args) throws ArithmeticException {

        // for (int i = 65; i <= 90; i++) {
        // char c = (char) i;
        // System.out.println(c);
        // }
        // for (int i = 97; i <= 122; i++) {
        // System.out.println((char) i);
        // }
        // long lo = 982382838238l;
        // float h = 9.809f;
        // byte o = 126;
        // short s = 234;
        Scanner sc = new Scanner(System.in);

        project po1 = new project();
        po1.batch = sc.nextInt();
        po1.score = sc.nextShort();
        po1.average = sc.nextDouble();
        po1.gpa = sc.nextFloat();
        po1.name = sc.next();
        po1.gender = sc.next().charAt(0);
        po1.rollnumber = sc.nextByte();
        po1.completed = sc.nextBoolean();
        System.out.println("Batch: " + po1.batch);
        System.out.println("Score: " + po1.score);
        System.out.println("Average: " + po1.average);
        System.out.println("GPA: " + po1.gpa);
        System.out.println("Name: " + po1.name);
        System.out.println("Gender: " + po1.gender);
        System.out.println("Roll Number: " + po1.rollnumber);
        System.out.println("completed:" + po1.completed);

        project po2 = new project();
        po2.batch = sc.nextInt();
        po2.score = sc.nextShort();
        po2.average = sc.nextDouble();
        po2.gpa = sc.nextFloat();
        po2.name = sc.next();
        po2.gender = sc.next().charAt(0);
        po2.rollnumber = sc.nextByte();
        System.out.println("Batch: " + po2.batch);
        System.out.println("Score: " + po2.score);
        System.out.println("Average: " + po2.average);
        System.out.println("GPA: " + po2.gpa);
        System.out.println("Name: " + po2.name);
        System.out.println("Gender: " + po2.gender);
        System.out.println("Roll Number: " + po2.rollnumber);
        System.out.println("completed:" + po2.completed);

        sc.close();

    }
}
