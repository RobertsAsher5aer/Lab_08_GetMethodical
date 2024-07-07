import java.util.Scanner;

public class CtoFTableDisplay {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Prompt the user for the start and end values for Celsius
            System.out.print("Enter the start value for Celsius: ");
            int startCelsius = scanner.nextInt();

            System.out.print("Enter the end value for Celsius: ");
            int endCelsius = scanner.nextInt();

            // Print the table header
            System.out.printf("%-10s %10s%n", "Celsius", "Fahrenheit");
            System.out.println("----------------------------");

            // Generate the table
            for (int celsius = startCelsius; celsius <= endCelsius; celsius++) {
                double fahrenheit = CtoF(celsius);
                System.out.printf("%-10d %10.2f%n", celsius, fahrenheit);
            }

            scanner.close();
        }

        public static double CtoF(double celsius) {
            return (celsius * 9 / 5) + 32;
        }
}