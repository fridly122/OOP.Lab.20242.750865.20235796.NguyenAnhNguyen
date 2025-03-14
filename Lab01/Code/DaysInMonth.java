import java.util.Scanner;

public class DaysInMonth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year;
        int month = -1;
        String monthInput;
        
        while (true) {
            System.out.print("Enter month (name, abbreviation, or number): ");
            monthInput = scanner.next();

            month = getMonthNumber(monthInput);
            if (month == -1) {
                System.out.println("Invalid month. Try again.");
                continue;
            }

            System.out.print("Enter year: ");
            if (scanner.hasNextInt()) {
                year = scanner.nextInt();
                if (year >= 0) break;
                else System.out.println("Year must be non-negative.");
            } else {
                System.out.println("Invalid year. Try again.");
                scanner.next();
            }
        }

        int days = getDaysInMonth(month, year);
        System.out.println("Number of days: " + days);
        scanner.close();
    }

    public static int getMonthNumber(String month) {
        month = month.toLowerCase();
        switch (month) {
            case "january", "jan.", "jan", "1": return 1;
            case "february", "feb.", "feb", "2": return 2;
            case "march", "mar.", "mar", "3": return 3;
            case "april", "apr.", "apr", "4": return 4;
            case "may", "5": return 5;
            case "june", "jun.", "jun", "6": return 6;
            case "july", "jul.", "jul", "7": return 7;
            case "august", "aug.", "aug", "8": return 8;
            case "september", "sept.", "sep", "9": return 9;
            case "october", "oct.", "oct", "10": return 10;
            case "november", "nov.", "nov", "11": return 11;
            case "december", "dec.", "dec", "12": return 12;
            default: return -1;
        }
    }

    public static int getDaysInMonth(int month, int year) {
        return switch (month) {
            case 4, 6, 9, 11 -> 30;
            case 2 -> (isLeapYear(year) ? 29 : 28);
            default -> 31;
        };
    }

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}
