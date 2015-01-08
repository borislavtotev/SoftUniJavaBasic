import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class _5_CountAllWords {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String sentance = input.nextLine();
		
		input.close();
		
		Pattern wordPattern = Pattern.compile(
		"(^|\\b)\\p{Alpha}+(\\b|$)");
		
		Matcher matcher = wordPattern.matcher(sentance);
		
		int count = 0;
		
		while (matcher.find()) {
			//System.out.println(matcher.group());
			count++;
		}
		System.out.println(count);
	}
}
