import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter start : ");
        int start= input.nextInt();

        System.out.print("Enter end : ");
        int end = input.nextInt();
        int count = 0;
        for (int num = start; num <= end; num++){

            if(num < 2){
                continue;
            }
            boolean isPrime = true;
            for (int i = 2; i <= Math.sqrt(num); i++){
                if(num % i == 0){
                    isPrime = false;
                    break;
                }
            }
            if (isPrime){
                System.out.println(num + " is prime number.");
                count++;
            }
        }
        if (count == 0){
            System.out.println("No prime number");
        }

        }

    }

