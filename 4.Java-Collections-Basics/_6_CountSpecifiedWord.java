import java.util.Scanner;
import java.util.regex.*;


public class _6_CountSpecifiedWord {
	public static void main(String[] args) {
			
		Scanner input = new Scanner(System.in);
		
		String sentance = input.nextLine();
		String word = input.nextLine();
		
		input.close();
		
		Pattern wordPattern = Pattern.compile(
				"(^|\\b)" + word + "(\\b|$)", Pattern.CASE_INSENSITIVE);
		System.out.println(wordPattern);
		
		Matcher matcher = wordPattern.matcher(sentance);
		
		int count = 0;
		
		while (matcher.find()) {
			if ( matcher.group().equalsIgnoreCase(word) ) {
				count++;
			}
		}
		System.out.println(count);
	}
}
