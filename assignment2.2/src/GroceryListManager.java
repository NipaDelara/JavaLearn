import java.util.ArrayList;

public class GroceryListManager {

    // Create ArrayList
    private final ArrayList<String> groceryList = new ArrayList<>();

    // Method to add item
    public void addItem(String item) {
        if (!groceryList.contains(item)) {
            groceryList.add(item);
            System.out.println(item + " added to the list.");
        } else {
            System.out.println(item + " is already in the list.");
        }
    }

    // Method to remove item
    public void removeItem(String item) {
        if (groceryList.contains(item)) {
            groceryList.remove(item);
            System.out.println(item + " removed from the list.");
        } else {
            System.out.println(item + " is not in the list.");
        }
    }

    // Method to display list
    public void displayList() {
        System.out.println("\nGrocery List:");
        if (groceryList.isEmpty()) {
            System.out.println("The list is empty.");
        } else {
            for (int i = 0; i < groceryList.size(); i++) {
                System.out.println((i + 1) + ". " + groceryList.get(i));
            }
        }
    }

    // Method to check item
    public boolean checkItem(String item) {
        return groceryList.contains(item);
    }

    // Main method
    public static void main(String[] args) {
        GroceryListManager manager = new GroceryListManager();

        // Add items
        manager.addItem("Apples");
        manager.addItem("Milk");
        manager.addItem("Bread");

        // Display list
        manager.displayList();

        // Check item
        String itemToCheck = "Milk";
        System.out.println("\nIs \"" + itemToCheck + "\" in the grocery list? "
                + manager.checkItem(itemToCheck));

        // Remove item
        System.out.println("\nRemoving \"Milk\" from the list...");
        manager.removeItem("Milk");

        // Display updated list
        manager.displayList();
    }
}