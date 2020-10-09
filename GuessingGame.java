import java.util.Scanner;
import java.util.Random;

public class GuessingGame {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Random randomNumber = new Random();

		int guessNumber = randomNumber.nextInt(10);
		System.out.println(guessNumber);
		int number = 0;

		while (number < 3) {
			System.out.println("\nEnter your guess: ");
			int answer = input.nextInt();
			number += 1;

			if (answer == guessNumber) {
				System.out.println("Your guess is right!");
				break;
			} else {
				System.out.println("You are wrong at guessing numbers.");
			}
		}
		
		input.close();
		}
}

