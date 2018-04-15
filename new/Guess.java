import java.util.Random;
import java.util.Scanner;

public class Guess 
{

	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("who do you want to think a number?\n\t1.you \n\t2.me");
		int input = scan.nextInt();

		if (input == 1) {
			personGuess();
		} else if (input == 2) {
			computerGuess();
		} else {
			System.out.println("Invalid number");
		}
	}
	
	
	public static void computerGuess()//method for computer guess
	{
		Random generator = new Random();
		Scanner scan = new Scanner(System.in);
		
		System.out.println("OK\nThink of an integer between 1 to 100");
		System.out.println("i'll guess it\nif you are ready press Enter");
        System.out.println(scan.nextLine());
		
        boolean guessed = false;
	
		int guess = 0;
		int count1 = 1;
		int random = generator.nextInt(100) + 1;//it will generate random number 
		int max = 100;
		int min = 0;
		int ans = 0;
		
		while (!guessed) {
			// first move
			if (ans == 0) {
				guess = random;
			}

			System.out.printf("Is the number %d?\n", guess);
			System.out.println("\t1.Too high\n\t2.Too low\n\t3.Currect number");

			if (!scan.hasNextInt()) {

				System.out.println("Invalid number");
			} else {
				ans = scan.nextInt();
			}
			if (ans == 1) {
				max = guess;
			} else if (ans == 2) {
				min = guess;

			} else if (ans == 3) {

				System.out.printf("I guess your number in %d tries", count1);
				guessed = true;
			}
			guess = (max + min) / 2;
			count1++;
		}
	
	}
	
	public static void personGuess() {
		Random rand = new Random();
		Scanner scan = new Scanner(System.in);

		
		boolean guessed = false;
		int count2 = 0;
		int randInt = rand.nextInt(100) + 1;

		System.out.println("OK\nI am thimking of a number between 1 to 100");
		System.out.println("You have to guess it\nEnter your guess ");
	
       
		while (!guessed) {
			int guess = 0;
			do {
				if (!scan.hasNextInt()) {
					String notInt = scan.next();
					System.out.printf("%s\t is not an integer!\n", notInt);

				} else
					guess = scan.nextInt();
				count2++;
			} while (guess == 0);
			
			if (guess > 100) {
				System.out.println(guess + "is way too high!");
			} else if (guess < 1) {
				System.out.println(guess + "is way too low!");
			}

			else if (guess > randInt) {
				System.out.println(guess + "is too high!");
			}
			
			else if (guess < randInt) {
				System.out.println(guess + "is too low!");
			} else if (guess == randInt) {
				System.out.println(guess + " is currect");
				guessed = true;
				System.out.println("It tooks you\n" + count2 + " ties");
			}
		}
		
	}
	
}
