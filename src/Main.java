import java.util.Random;

public class Main {
    public static void main(String[] args) {
        float dailyWage;
        int wagePerHour = 20, fullDayHour = 0;

        System.out.println("Welcome to Employee Wage Computation Program.");

        Random random = new Random();
        int attendance = random.nextInt(2);
        System.out.println(attendance);
        int isPartTime = 1 + random.nextInt(2);

        switch (attendance) {
            case 1:
                System.out.println("Employee is present!");
                switch (isPartTime) {
                    case 1:
                        System.out.println("Employee is part time.");
                        fullDayHour = 4;
                        break;
                    case 2:
                        System.out.println("Employee is full time.");
                        fullDayHour = 8;
                }
                break;
            case 0:
                System.out.println("Employee is absent.");

        }

        dailyWage = wagePerHour * fullDayHour;
        System.out.println("Daily wage of employee: " + dailyWage);

    }
}