package debuyck.jens;


import java.util.Scanner;

public class pickRandomNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int number = (int)(1 + Math.random() * 100);
		
		System.out.println("Pick a number between 1 and 100");
		Scanner scanner = new Scanner(System.in);
		
		int guesses = 5;
		boolean done = false;
		while(!done){
			
			int playerGuess = scanner.nextInt();
			
			if(playerGuess < 1 || playerGuess > 100) {
				System.out.println("Please pick a number between 1 and 100");
			}
			
			if(number < playerGuess){
				System.out.println("Please pick a lower number");
				guesses--;
			}
			else if(number > playerGuess){
				System.out.println("Please pick a higher number");
				guesses--;
			}
			
			if(guesses == 0) {
					System.out.println("You lose!");
					System.out.println("The number to guess was: " + number);
			}
			
			if(number == playerGuess){
				System.out.println("You win!");	
				done = true;
			}
		}
		scanner.close();
	}

}
