import java.util.Scanner;

public class NameGenerator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//name array
        String[] firstNames = {"John", "Emma", "Liam", "Olivia", "Noah", "Ava"};
        String[] lastNames = {"Smith", "Johnson", "Brown", "Taylor", "Anderson", "Thomas"};

        System.out.print("How many name you want to add? ");
        int count = input.nextInt();

        // Loop to generate names
        for (int i = 0; i < count; i++) {
            int firstIndex = (int)(Math.random() * firstNames.length);
            int lastIndex = (int)(Math.random() * lastNames.length);
            String fullName = firstNames[firstIndex] + " " + lastNames[lastIndex];

            System.out.println(fullName);
        }
        input.close();
    }
}
