import java.util.Scanner;

public class MaxSubarray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int size = input.nextInt();

        int[] array = new int[size];

        System.out.println("Enter the integers into the array:");
        for (int i = 0; i < size; i++) {
            System.out.print("Enter integer " + (i + 1) + ": ");
            array[i] = input.nextInt();
        }

        int maxSum = array[0];
        int startIndex = 0;
        int endIndex = 0;

        // Check all possible subarrays
        for (int i = 0; i < size; i++) {
            int currentSum = 0;

            for (int j = i; j < size; j++) {
                currentSum = currentSum + array[j];

                if (currentSum > maxSum) {
                    maxSum = currentSum;
                    startIndex = i;
                    endIndex = j;
                }
            }
        }

        System.out.println("Maximum sum: " + maxSum);
        System.out.println("Integers: " + (startIndex + 1) + "-" + (endIndex + 1));

        input.close();
    }
}
