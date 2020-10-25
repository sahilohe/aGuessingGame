package com.fsociety97;
import java.util.Scanner;
import java.util.Random;

public class GuessingGame {

	public static void main() {
		Scanner input = new Scanner(System.in);
		Random randomNumber = new Random();
		boolean yes = false;

		int guessNumber = randomNumber.nextInt(10);
		System.out.println(guessNumber);
		int number = 0;

		while (number < 3) {
			System.out.println("Enter your guess: ");
			int answer = input.nextInt();
			number += 1;

			if (answer == guessNumber) {
				System.out.println("\nYou did it!");
				yes = true;
				break;
			} else {
				System.out.println("Nope!\n");
			}
		}
		if (yes) {
			System.out.println("Your guess is right!");
		}
		else {
			System.out.println("\nYou are done! You are bad at guessing.");
		}
		input.close();
		}
}
