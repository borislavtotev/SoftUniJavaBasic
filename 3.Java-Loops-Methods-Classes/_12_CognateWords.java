import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class _12_CognateWords {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String inputStr = input.nextLine();
		
		Pattern p = Pattern.compile("([a-zA-Z]+)");
		Matcher m = p.matcher(inputStr);
		
		List<String> allWords = new ArrayList<String>();
		while (m.find()) {
			allWords.add(m.group(1));
		}
		
		List<String> Results = new ArrayList<String>();
		
		for (int i = 0; i < allWords.size(); i++) {
			for (int j = 0; j < allWords.size(); j++) {
					for (int j2 = 0; j2 < allWords.size(); j2++) {
							if (allWords.get(i).equals(allWords.get(j)+allWords.get(j2)) && (! Results.contains(allWords.get(j)+ "|" + allWords.get(j2) + "=" + allWords.get(i)))) {
								Results.add(allWords.get(j)+ "|" + allWords.get(j2) + "=" + allWords.get(i));
							}
							if (allWords.get(i).equals(allWords.get(j2)+allWords.get(j)) && (! Results.contains(allWords.get(j2)+ "|" + allWords.get(j) + "=" + allWords.get(i)))) {
								Results.add(allWords.get(j2)+ "|" + allWords.get(j) + "=" + allWords.get(i));
							}
					}
			}
		}
		
		if (Results.size() == 0) {
			System.out.println("No");
		} else {
			for (int i = 0; i < Results.size(); i++) {
				System.out.println(Results.get(i));
			}
		}
		
		input.close();

	}
}
