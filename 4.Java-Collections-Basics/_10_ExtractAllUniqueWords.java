import java.util.Scanner;
import java.util.TreeSet;
import java.util.regex.*;

public class _10_ExtractAllUniqueWords {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		String sentance = input.nextLine();
		sentance = sentance.toLowerCase();

		input.close();

		Pattern wordPattern = Pattern.compile("(^|\\b)\\p{Alpha}+(\\b|$)");

		Matcher matcher = wordPattern.matcher(sentance);
		
		TreeSet<String> uniqueWords = new TreeSet<>();

		while (matcher.find()) {
			uniqueWords.add(matcher.group());
		}

		for (String string : uniqueWords) {
			System.out.print(string + " ");
		}
	}
}
