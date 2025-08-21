package lab2;
import java.util.Scanner;

public class sqrt_guess {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int score = 0;
		for(int i=0; i<3; i++) {
			double num = Math.floor(Math.random() * 100 + 1);
			System.out.print("What's the square root of " + num + "?: ");
			if(scanner.nextDouble() == Math.sqrt(num)) {
				System.out.println("Nice job!");
				score++;
			} else {
				System.out.println("So close, it's "+Math.sqrt(num));
			}
		}
		System.out.println("\nYou got "+score+"/3");
		scanner.close();
	}
}
