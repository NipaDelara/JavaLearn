import java.util.Scanner;
public class RemoveDuplicate {

public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    // Ask size
    System.out.print("Enter the size of the array: ");
    int size = input.nextInt();

    int[] array = new int[size];

    // Input numbers
    System.out.println("Enter the integers into the array:");
    for (int i = 0; i < size; i++) {
        System.out.print("Enter integer " + (i + 1) + ": ");
        array[i] = input.nextInt();
    }

    // New array for unique values
    int[] unique = new int[size];
    int uniqueCount = 0;

    // Remove duplicates
    for (int i = 0; i < size; i++) {
        boolean isDuplicate = false;

        // Check if array[i] already exists in unique array
        for (int j = 0; j < uniqueCount; j++) {
            if (array[i] == unique[j]) {
                isDuplicate = true;
                break;
            }
        }

        // If not duplicate, store it
        if (!isDuplicate) {
            unique[uniqueCount] = array[i];
            uniqueCount++;
        }
    }
    // Print result
        System.out.println("The array without duplicates:");
        for (int i = 0; i < uniqueCount; i++) {
            System.out.print(unique[i] + " ");
        }

        input.close();
    }
}
