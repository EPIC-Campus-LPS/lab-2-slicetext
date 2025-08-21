package lab2;
import java.util.Scanner;

public class text_analyzer {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input: ");
		String word = scanner.nextLine();
		scanner.close();
		System.out.println("Number of Letters: "+word.length());
		
		for(int i=0; i<word.length(); i++) {
			if("aeiouy".indexOf(word.charAt(i)) != -1) {
				System.out.println("Index of first vowel: " + i);
				break;
			}
		}
		
		System.out.println("Uppercase: " + word.toUpperCase());
		System.out.println("Secret String: " + word.substring(0, 5).toLowerCase() + word.substring(word.length() - 3).toUpperCase() + word.length());
	}
}
