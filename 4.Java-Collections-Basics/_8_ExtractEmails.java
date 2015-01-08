import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class _8_ExtractEmails {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String text = input.nextLine();
		input.close();
		
		Pattern emailPattern = Pattern.compile("(^|\\b)([a-zA-Z0-9-]+[.-_]?[a-zA-Z0-9-]+([.-_]?[a-zA-Z0-9]+)+@[a-zA-Z]+[-]?[a-zA-Z]+([.][\\p{Alpha}]+[-]?[a-zA-Z}]+)+)(\\b|$)");
				
		Matcher matcher = emailPattern.matcher(text);
				
		while (matcher.find()) {
			System.out.println(matcher.group());
		}
		
	}


}
