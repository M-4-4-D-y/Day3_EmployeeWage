import java.util.Random;

public class Main {
    public static void main(String[] args) {
        float dailyWage, monthlyWage = 0;
        int wagePerHour = 20, fullDayHour = 0, workingDaysPerMonth = 20, day = 0;

        System.out.println("Welcome to Employee Wage Computation Program.");

        Random random = new Random();
        int attendance;

        int isPartTime;
        int workingHoursPerMonth = 0;
        while (workingHoursPerMonth <= 100 && day != 20) {
            day++;
            attendance = random.nextInt(2);
            isPartTime = 1 + random.nextInt(2);

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
            workingHoursPerMonth += fullDayHour;
            dailyWage = wagePerHour * fullDayHour;
            monthlyWage += dailyWage;
            System.out.println("Day " + day + " wage of employee: " + dailyWage + "\n");
        }
        System.out.println("\nMonth wage of employee: " + monthlyWage);
        System.out.println("\nProgram runs total: " + day + " times.");
    }
}