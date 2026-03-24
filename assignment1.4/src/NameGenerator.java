import java.util.Scanner;

public class NameGenerator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Arrays of first names and last names
        String[] firstNames = {"John", "Anna", "Peter", "Sara", "Mike"};
        String[] lastNames = {"Smith", "Johnson", "Brown", "Taylor", "Wilson"};

        // Ask user how many names to generate
        System.out.print("How many random names to generate? ");
        int count = input.nextInt();

        // Loop to generate names
        for (int i = 0; i < count; i++) {
            int firstIndex = (int)(Math.random() * firstNames.length);
            int lastIndex = (int)(Math.random() * lastNames.length);

            String fullName = firstNames[firstIndex] + " " + lastNames[lastIndex];

            // Print full name
            System.out.println(fullName);
        }

        input.close();
    }
}