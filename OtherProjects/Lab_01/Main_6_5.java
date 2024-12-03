import java.util.Scanner;

public class Main_6_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int year, month, day;


    while (true) {
        System.out.print("Enter the month : ");
        String month_inp = input.nextLine();

        System.out.print("Enter the year : ");
        String year_inp = input.nextLine();          

        if (isValidYear(year_inp)) {
            year = Integer.parseInt(year_inp);
            month = getMonth(month_inp);

            if (month != 0) {
                day = getDaysInMonth(month, year);
                System.out.printf("Thang %d nam %d co %d ngay", month, year, day);
                break;
            } else {
                System.out.println("Unsuitable month input");
            }
        } 
        else {
              System.out.println("Unsuitable year input");
        }
    }

        input.close();
    }

    private static int getDaysInMonth(int month, int year) {
        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (month == 2 && isLeapYear(year)) {
            return 29;
        }
        return daysInMonth[month - 1];
    }

    private static boolean isValidYear(String yearInput) {
        return yearInput.matches("\\d{4}") && Integer.parseInt(yearInput) >= 0;
    }

    private static boolean isLeapYear(int year) {
        return (year % 4 == 0) || ((year % 100 != 0)&&(year % 400 == 0));
    }

    private static int getMonth(String monthInput) {
        String[] month1 = {"January", "February", "March", "April", "May", "June", 
                               "July", "August", "September", "October", "November", "December"};
        String[] month2 = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", 
                                       "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        String[] month3 = {"Jan.", "Feb.", "Mar.", "Apr.", "May.", "Jun.", 
        "Jul.", "Aug.", "Sep.", "Oct.", "Nov.", "Dec."};
        String[] month4 = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"};

        for (int i = 0; i < 12; i++) {
            if (monthInput.equals(month1[i]) || 
                monthInput.equals(month2[i]) || 
                monthInput.equals(month3[i]) || 
                monthInput.equals(month4[i])) {
                    return i + 1;
            }
        }
        return -1;
    }
}