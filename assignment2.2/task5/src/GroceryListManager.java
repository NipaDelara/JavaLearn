import java.util.HashMap;
import java.util.Scanner;

public class GroceryListManager {

    private final HashMap<String, Double> itemCost = new HashMap<>();
    private final HashMap<String, String> itemCategory = new HashMap<>();
    private final HashMap<String, Integer> itemQuantity = new HashMap<>();

    // Add item with cost, category, quantity
    public void addItem(String item, double cost, String category, int quantity) {
        itemCost.put(item, cost);
        itemCategory.put(item, category);
        itemQuantity.put(item, quantity);
        System.out.println(item + " added successfully.");
    }

    // Update quantity
    public void updateQuantity(String item, int newQuantity) {
        if (itemQuantity.containsKey(item)) {
            itemQuantity.put(item, newQuantity);
            System.out.println("Quantity of " + item + " updated to " + newQuantity);
        } else {
            System.out.println(item + " not found in the grocery list.");
        }
    }

    // Display all items
    public void displayList() {
        System.out.println("\nGrocery List:");
        int i = 1;
        for (String item : itemCost.keySet()) {
            System.out.println(i + ". " + item
                    + " | Cost: €" + itemCost.get(item)
                    + " | Category: " + itemCategory.get(item)
                    + " | Quantity: " + itemQuantity.get(item));
            i++;
        }

        if (itemCost.isEmpty()) {
            System.out.println("The grocery list is empty.");
        }
    }

    // Display items by category
    public void displayByCategory(String category) {
        System.out.println("\nItems in category: " + category);
        int i = 1;

        for (String item : itemCategory.keySet()) {
            if (itemCategory.get(item).equalsIgnoreCase(category)) {
                System.out.println(i + ". " + item
                        + " | Cost: €" + itemCost.get(item)
                        + " | Quantity: " + itemQuantity.get(item));
                i++;
            }
        }

        if (i == 1) {
            System.out.println("No items found in this category.");
        }
    }

    // Display available items
    public void displayAvailableItems() {
        System.out.println("\nAvailable Items (quantity more than 0):");
        int i = 1;

        for (String item : itemQuantity.keySet()) {
            if (itemQuantity.get(item) > 0) {
                System.out.println(i + ". " + item
                        + " | Quantity: " + itemQuantity.get(item));
                i++;
            }
        }

        if (i == 1) {
            System.out.println("No items available.");
        }
    }

    // Calculate total cost
    public double calculateTotalCost() {
        double total = 0;

        for (String item : itemCost.keySet()) {
            total = total + (itemCost.get(item) * itemQuantity.get(item));
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

        // Add items using user input
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for item " + (i + 1) + ":");

            System.out.print("Enter item name: ");
            String item = scanner.nextLine();

            System.out.print("Enter cost of " + item + ": ");
            double cost = scanner.nextDouble();
            scanner.nextLine();

            System.out.print("Enter category of " + item + ": ");
            String category = scanner.nextLine();

            System.out.print("Enter quantity of " + item + ": ");
            int quantity = scanner.nextInt();
            scanner.nextLine();

            manager.addItem(item, cost, category, quantity);
        }

        // Display all items
        manager.displayList();

        // Test total cost
        System.out.println("\nTotal cost of all items: €" + manager.calculateTotalCost());

        // Test category display
        System.out.print("\nEnter a category to display items: ");
        String searchCategory = scanner.nextLine();
        manager.displayByCategory(searchCategory);

        // Test quantity update
        System.out.print("\nEnter item name to update quantity: ");
        String updateItem = scanner.nextLine();

        System.out.print("Enter new quantity: ");
        int newQuantity = scanner.nextInt();
        scanner.nextLine();

        manager.updateQuantity(updateItem, newQuantity);

        // Display list after updating quantity
        System.out.println("\nUpdated Grocery List:");
        manager.displayList();

        // Display available items
        manager.displayAvailableItems();

        // Display total cost again after quantity update
        System.out.println("\nUpdated total cost: €" + manager.calculateTotalCost());

        scanner.close();
    }
}