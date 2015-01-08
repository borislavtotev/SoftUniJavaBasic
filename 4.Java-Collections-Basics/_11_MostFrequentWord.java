import java.util.Collections;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _11_MostFrequentWord {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		String sentance = input.nextLine();
		sentance = sentance.toLowerCase();

		input.close();

		Pattern wordPattern = Pattern.compile("(^|\\b)\\p{Alpha}+(\\b|$)");

		Matcher matcher = wordPattern.matcher(sentance);

		TreeMap<String,Integer> uniqueWords = new TreeMap<>();

		while (matcher.find()) {
			if (uniqueWords.containsKey(matcher.group())) {
				uniqueWords.put(matcher.group(), uniqueWords.get(matcher.group())+1);
			} else {
				uniqueWords.put(matcher.group(), 1);
			}
		}

		int max = Collections.max(uniqueWords.values());
		
		for (String string : uniqueWords.keySet()) {
			if (uniqueWords.get(string) == max) {
				System.out.println(string + " -> " + uniqueWords.get(string) + " times");
			}
		}
	}
}
