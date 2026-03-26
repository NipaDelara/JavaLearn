import java.util.ArrayList;
import java.util.Scanner;

public class GroceryListManager {
    private ArrayList<String> groceryList = new ArrayList<>();

    // Method to add item
    public void addItem(String item) {
        if (!groceryList.contains(item)) {
            groceryList.add(item);
        } else {
            System.out.println(item + " is already in the list.");
        }
    }

    // Method to remove item by number
    public void removeItem(int index) {
        if (index >= 0 && index < groceryList.size()) {
            String item = groceryList.get(index);
            groceryList.remove(index);
            System.out.println("\nRemoving \"" + item + "\" from the list...");
        } else {
            System.out.println("Invalid item number.");
        }
    }

    // Method to display list
    public void displayList() {
        System.out.println("\nGrocery List:");
        for (int i = 0; i < groceryList.size(); i++) {
            System.out.println((i + 1) + ". " + groceryList.get(i));
        }
    }

    // Method to check item by number
    public boolean checkItem(int index) {
        return index >= 0 && index < groceryList.size();
    }

    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GroceryListManager manager = new GroceryListManager();

        // Add items
        System.out.print("How many items do you want to add? ");
        int n = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter item " + (i + 1) + ": ");
            String item = scanner.nextLine();
            manager.addItem(item);
        }

        // Display list
        manager.displayList();

        // Check item by number
        System.out.print("\nEnter item number to check: ");
        int checkIndex = scanner.nextInt() - 1;

        System.out.println("\nIs item number " + (checkIndex + 1) +
                " in the grocery list? " + manager.checkItem(checkIndex));

        // Remove item by number
        System.out.print("\nEnter item number to remove: ");
        int removeIndex = scanner.nextInt() - 1;
        manager.removeItem(removeIndex);

        // Display updated list
        manager.displayList();

        scanner.close();
    }
}