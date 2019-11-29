import java.util.Random;
import java.util.Scanner;

public class GuessStarter {

    public static void main(String[] args) {
        // pick a random number
        Random random = new Random();
        int number = random.nextInt(100) + 1;
        Scanner in = new Scanner (System.in);

        System.out.println("I'm thinking of a number between 1 and 100 (including both). Can you guess what it is?");
        System.out.print("Type a number: ");

        int guessNumber = in.nextInt();
        System.out.println("Your guess is: "+ guessNumber);
        System.out.println("The number I was thinking of is: "+ number);

        int differenceBetweenNumbers = Math.abs(number - guessNumber);
        System.out.println("You were off by: "+ differenceBetweenNumbers);
    }
}
