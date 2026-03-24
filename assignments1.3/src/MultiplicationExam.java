import java.util.Scanner;

public class MultiplicationExam {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            int score = 0;

            for (int i = 1; i <= 10; i++) {
                int num1 = (int) (Math.random() * 10) + 1;
                int num2 = (int) (Math.random() * 10) + 1;

                System.out.println("Question" + i + ": ");
                System.out.println(num1 + " * " + num2 + " = ");
                int answer = input.nextInt();
                if (answer == num1 * num2) {
                    System.out.println("Correct!");
                    score++;
                } else {
                    System.out.println("Wrong!Correct number is : " + (num1 * num2));
                }
            }
            System.out.println("Your score : " + score + "/10");
            if(score == 10){
                System.out.println("Congratulations! You win!");
                break;
            }else{
                System.out.println("Let's try again!");


            }

        }
    }
}
