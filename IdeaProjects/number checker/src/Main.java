import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int min = 1, max = 100;
        int maxAttempts = 5;
        char playAgain;
        do {
            int number = rand.nextInt(max - min + 1) + min;
            int attempts = 0;
            boolean guessed = false;

            System.out.println("Guess the number between " + min + " and " + max);

            while (attempts < maxAttempts) {
                System.out.print("Enter your guess: ");
                int guess = sc.nextInt();
                attempts++;

                if (guess == number) {
                    System.out.println("Correct! You guessed it in " + attempts + " attempts.");
                    guessed = true;
                    break;
                } else if (guess < number) {
                    System.out.println("Too low!");
                } else {
                    System.out.println("Too high!");
                }
            }
            if (!guessed) {
                System.out.println("Out of attempts! The number was: " + number);
            }
            System.out.print("Do you want to play again? (y/n): ");
            playAgain = sc.next().charAt(0);
        }
        while (playAgain == 'y' || playAgain == 'Y');

        sc.close();
        System.out.println("Thanks for playing!");
    }
}