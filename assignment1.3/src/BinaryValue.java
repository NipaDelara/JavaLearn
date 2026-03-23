import java.util.Scanner;
public class BinaryValue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a binary number : ");
        String binary = input.nextLine();

        int decimal = 0;


        for (int i =0; i< binary.length(); i++){
            char bit= binary.charAt(i);
            decimal = decimal * 2;
            if(bit == '1'){
                decimal = decimal + 1;
            }

        }
        System.out.println("Decimal : " + decimal);

    }
}
