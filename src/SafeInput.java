import java.util.Scanner;

public static int getRangedInt(Scanner pipe, String prompt, int low, int high){

    int value = 0;
    boolean validInput = false;

    while(!validInput) {
        System.out.print(prompt + " [" + low + " - " + high + "]: ");
        if (pipe.hasNextInt()) {
            value = pipe.nextInt();
            if (value >= low && value <= high) {
                validInput = true;

            } else {
                System.out.println("Invalid input: " + value + ". Please enter a value between " + low + " and " + high + ".");

            }

        } else {
            String trash = pipe.next();
            System.out.println("Invalid input: " + trash + ". Please enter a valid integer.");

        }
        pipe.nextLine();
    }

    return value;
}