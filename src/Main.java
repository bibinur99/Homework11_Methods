import java.time.LocalDate;
public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }
    public static boolean checkTheYear(int value) {    // task one
        return ((value % 4 != 0) || (value % 100 == 0 && value % 400 != 0));
    }
    public static String usersOS(int num) {           // task two
        return (num == 1) ? "Android" : "iOS";
    }
    public static String ifOsOld(int num) {          // task two
        int currentYear = LocalDate.now().getYear();
        return (num < currentYear) ? "Light" : "Ordinary";
    }
    public static int calculateDays(int val) {      // task three
        int days = 0;
        if (val < 20) {
            days = 1;
        } else if (20 <= val && val < 60) {
            days = 2;
        } else if (60 <= val && val < 100) {
            days = 3;
        }
        return days;
    }
//////////////////////////////////////  PROBLEMS SOLUTION

    public static void task1() {   // Провека года на високосность
        System.out.println("Task ONE:");
        int year = 2023;
        boolean answer = checkTheYear(year);
        if (answer) {
            System.out.println("Обычный год");
        } else {
            System.out.println("Високосный");
        }
        System.out.println();
    }

    public static void task2() {
        System.out.println("Task TWO:");  // ОС пользователя
            int userOSNum = 0;
            int userYear = 2015;
            String userOsType = usersOS(userOSNum);
            String userOsToInstall = ifOsOld(userYear);
            System.out.println("Recommended OS for you: " + userOsType + " " + userOsToInstall);
        System.out.println();
    }

    public static void task3() {
        System.out.println("Task THREE:"); // delivery
        int distance = 95;
        if (distance < 100) {
            int daysToDelivery = calculateDays(distance);
            System.out.println("Delivery in " + daysToDelivery + " days");
        } else {
            System.out.println("Delivery is not possible");
        }
    }

}


