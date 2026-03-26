import java.util.HashMap;
import java.util.Scanner;

public class GroceryListManager {
    private HashMap<String, Double> groceryList = new HashMap<>();

    // Add item with cost
    public void addItem(String item, double cost) {
        groceryList.put(item, cost);
        System.out.println(item + " added with cost " + cost);
    }

    // Display list
    public void displayList() {
        System.out.println("\nGrocery List:");
        int i = 1;
        for (String item : groceryList.keySet()) {
            System.out.println(i + ". " + item + " - €" + groceryList.get(item));
            i++;
        }
    }

    // Calculate total cost
    public double calculateTotalCost() {
        double total = 0;
        for (double cost : groceryList.values()) {
            total += cost;
        }
        return total;
    }

    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GroceryListManager manager = new GroceryListManager();

        System.out.print("How many items do you want to add? ");
        int n = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter item name: ");
            String item = scanner.nextLine();

            System.out.print("Enter cost of " + item + ": ");
            double cost = scanner.nextDouble();
            scanner.nextLine();

            manager.addItem(item, cost);
        }

        // Display list
        manager.displayList();

        // Total cost
        double total = manager.calculateTotalCost();
        System.out.println("\nTotal cost of all items: €2" + total);

        scanner.close();
    }
}