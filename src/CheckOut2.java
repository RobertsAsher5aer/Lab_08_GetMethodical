import java.util.Scanner;

 public class CheckOut2 {
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         double totalCost = 0.0;
         boolean moreItems = true;

         while (moreItems) {
             double price = SafeInput.getRangedDouble(scanner, "Enter the price of your item", 0.50, 10.00);
             totalCost += price;
             moreItems = SafeInput.getYNConfirm(scanner, "Do you have more items?");
         }

         System.out.printf("Total cost of the item(s): $%.2f%n", totalCost);
         scanner.close();
     }
}