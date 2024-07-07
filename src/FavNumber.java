import java.util.Scanner;

public class FavNumber {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int favInt = SafeInput.getInt(in, "Please enter your favorite integer: ");
        System.out.println("Your favorite integer is: " + favInt + ".");



        double favDouble = SafeInput.getDouble(in, "Please enter your favorite double (decimal): ");
        System.out.println("Your favorite double is: " + favDouble + ".");



        in.close();

    }
}