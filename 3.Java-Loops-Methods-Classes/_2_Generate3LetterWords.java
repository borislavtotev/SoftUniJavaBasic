import java.util.Scanner;


public class _2_Generate3LetterWords {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String inputLine = input.nextLine();
		
		char[] inputChars = inputLine.toCharArray();
		
		for (int i = 0; i < inputChars.length; i++) {
			for (int j = 0; j < inputChars.length; j++) {
				for (int k = 0; k < inputChars.length; k++) {
					System.out.println(String.valueOf(inputChars[i])+String.valueOf(inputChars[j])+String.valueOf(inputChars[k]));
				}
			}
		}
		
		input.close();
		
	}
}
