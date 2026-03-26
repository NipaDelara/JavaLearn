import java.util.HashMap;
import java.util.Scanner;

public class GroceryListManager {

    private HashMap<String, Double> itemCost = new HashMap<>();
    private HashMap<String, String> itemCategory = new HashMap<>();

    // Add item with cost and category
    public void addItem(String item, double cost, String category) {
        itemCost.put(item, cost);
        itemCategory.put(item, category);
        System.out.println(item + " added to category " + category + " with cost €" + cost);
    }

    // Display all items
    public void displayList() {
        System.out.println("\nGrocery List:");
        int i = 1;
        for (String item : itemCost.keySet()) {
            System.out.println(i + ". " + item + " - €" + itemCost.get(item)
                    + " (" + itemCategory.get(item) + ")");
            i++;
        }
    }

    // Display items by category
    public void displayByCategory(String category) {
        System.out.println("\nItems in category: " + category);
        int i = 1;
        for (String item : itemCategory.keySet()) {
            if (itemCategory.get(item).equalsIgnoreCase(category)) {
                System.out.println(i + ". " + item + " - €" + itemCost.get(item));
                i++;
            }
        }
        if (i == 1) {
            System.out.println("No items found in this category.");
        }
    }

    // Calculate total cost
    public double calculateTotalCost() {
        double total = 0;
        for (double cost : itemCost.values()) {
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

            System.out.print("Enter category (Fruits/Dairy/Bakery/etc): ");
            String category = scanner.nextLine();

            manager.addItem(item, cost, category);
        }

        // Display all items
        manager.displayList();

        // Display by category
        System.out.print("\nEnter category to display: ");
        String searchCategory = scanner.nextLine();
        manager.displayByCategory(searchCategory);

        // Total cost
        System.out.println("\nTotal cost: €" + manager.calculateTotalCost());

        scanner.close();
    }
}