import java.util.Scanner;

public class Reggie {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get SSN
        String ssnPattern = "^\\d{3}-\\d{2}-\\d{4}$";
        String ssn = SafeInput.getRegExString(scanner, "Enter your SSN (###-##-####):", ssnPattern);
        System.out.println("Valid SSN entered: " + ssn);

        // Get UC Student M number
        String mNumberPattern = "^(M|m)\\d{5}$";
        String mNumber = SafeInput.getRegExString(scanner, "Enter your UC Student M number (M##### or m#####):", mNumberPattern);
        System.out.println("Valid UC Student M number entered: " + mNumber);

        // Get menu choice
        String menuChoicePattern = "^[OoSsVvQq]$";
        String menuChoice = SafeInput.getRegExString(scanner, "Enter your menu choice (O/S/V/Q):", menuChoicePattern);
        System.out.println("Valid menu choice entered: " + menuChoice);

        scanner.close();
    }
}