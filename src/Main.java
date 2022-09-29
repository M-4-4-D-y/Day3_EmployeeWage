import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the Employee wage computation");
       Random random = new Random();
        boolean attendance = random.nextBoolean();
        System.out.println(attendance);
        if (attendance)
            System.out.println("Employee is present.");
        else
            System.out.println("Employee is absent.");
    }
}