import java.util.Random;
import java.util.Scanner;

public class GuessingNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Random random = new Random();

        int guess, rand, tries = 0;

        System.out.println("Welcome to Guess the number game!");

        rand = random.nextInt(50) + 1;
        do {
            System.out.print("Guess a number between 1 & 50: ");
            guess = scan.nextInt();
    
            if(guess > rand){
                System.out.println("Too high, try again.");
            } else if ( guess < rand){
                System.out.println("Too low, try again.");
            }

            tries++;
            
        } while (guess != rand);

        System.out.println("You guessed the correct number " + rand);
        System.out.println("You tried " + tries + " time/s");

        scan.close();
    }
}
