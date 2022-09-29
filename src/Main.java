import java.util.Random;

public class Main {
    public static void main(String[] args) {
        float dailyWage;
        int wagePerHour = 20, fullDayHour = 0;

        System.out.println("Welcome to Employee Wage Computation Program.");

        Random random = new Random();
        boolean attendance = random.nextBoolean();
        System.out.println(attendance);
        if (attendance) {
            System.out.println("Employee is present.");
            fullDayHour = 8;
        }
        else
            System.out.println("Employee is absent.");

        dailyWage = wagePerHour * fullDayHour;
        System.out.println("Daily wage of employee: " + dailyWage);
    }
}