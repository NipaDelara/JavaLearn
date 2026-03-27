import java.util.HashMap;
import java.util.Scanner;

public class GroceryListManager {

    private HashMap<String, Double> itemCost = new HashMap<>();
    private HashMap<String, String> itemCategory = new HashMap<>();
    private HashMap<String, Integer> itemQuantity = new HashMap<>();

    // Add item with cost, category, quantity
    public void addItem(String item, double cost, String category, int quantity) {
        itemCost.put(item, cost);
        itemCategory.put(item, category);
        itemQuantity.put(item, quantity);
        System.out.println(item + " added | Cost: €" + cost + " | Category: "
                + category + " | Quantity: " + quantity);
    }

    // Update quantity
    public void updateQuantity(String item, int newQuantity) {
        if (itemQuantity.containsKey(item)) {
            itemQuantity.put(item, newQuantity);
            System.out.println("Quantity of " + item + " updated to " + newQuantity);
        } else {
            System.out.println(item + " not found in the list.");
        }
    }

    // Display all items
    public void displayList() {
        System.out.println("\nGrocery List:");
        int i = 1;
        for (String item : itemCost.keySet()) {
            System.out.println(i + ". " + item +
                    " | €" + itemCost.get(item) +
                    " | " + itemCategory.get(item) +
                    " | Qty: " + itemQuantity.get(item));
            i++;
        }
    }

    // Display items with positive quantity
    public void displayAvailableItems() {
        System.out.println("\nAvailable Items (Quantity > 0):");
        int i = 1;
        for (String item : itemQuantity.keySet()) {
            if (itemQuantity.get(item) > 0) {
                System.out.println(i + ". " + item +
                        " | Qty: " + itemQuantity.get(item));
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
            total += itemCost.get(item) * itemQuantity.get(item);
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

            System.out.print("Enter category: ");
            String category = scanner.nextLine();

            System.out.print("Enter quantity: ");
            int quantity = scanner.nextInt();
            scanner.nextLine();

            manager.addItem(item, cost, category, quantity);
        }

        // Display all items
        manager.displayList();

        // Update quantity
        System.out.print("\nEnter item name to update quantity: ");
        String updateItem = scanner.nextLine();
        System.out.print("Enter new quantity: ");
        int newQty = scanner.nextInt();
        manager.updateQuantity(updateItem, newQty);

        // Display available items
        manager.displayAvailableItems();

        // Total cost
        System.out.println("\nTotal cost: €" + manager.calculateTotalCost());

        scanner.close();
    }
}