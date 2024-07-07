import java.util.Scanner;


public class BirthDateTime {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int year = SafeInput.getRangedInt(scanner, "Enter the year of birth ", 1950, 2015);
        int month = SafeInput.getRangedInt(scanner, "Enter the month of birth ", 1, 12);
        int day = getDay(scanner, month); // Validate day based on month
        int hours = SafeInput.getRangedInt(scanner, "Enter the hour of birth ", 1, 24);
        int minutes = SafeInput.getRangedInt(scanner, "Enter the minute of birth ", 1, 59);

        System.out.println("Birth date and time entered: ");
        System.out.printf("%d-%02d-%02d %02d:%02d%n", year, month, day, hours, minutes);

        scanner.close();
    }

    // Method to get an integer within a specified range


    // Method to validate day based on month using switch statement
    public static int getDay(Scanner scanner, int month) {
        int day;
        switch (month) {
            case 1:  // January
            case 3:  // March
            case 5:  // May
            case 7:  // July
            case 8:  // August
            case 10: // October
            case 12: // December
                day = SafeInput.getRangedInt(scanner, "Enter the day of birth ", 1, 31);
                break;
            case 4:  // April
            case 6:  // June
            case 9:  // September
            case 11: // November
                day = SafeInput.getRangedInt(scanner, "Enter the day of birth ", 1, 30);
                break;
            case 2:  // February
                day = SafeInput.getRangedInt(scanner, "Enter the day of birth ", 1, 29); // Considering leap years separately
                break;
            default:
                day = 1; // Default to 1 (safeguard)
        }
        return day;
    }
}
