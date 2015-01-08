import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;



public class _14_ExamScore {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		input.nextLine();
		input.nextLine();
		input.nextLine();
		
		String newLine;
		TreeMap<String,ArrayList<String>> studentsResults = new TreeMap<>();
		HashMap<String,Double> scoreMap = new HashMap<>();
		do {
			newLine = input.nextLine();
			
			Pattern p = Pattern.compile(".*?([A-za-z]+\\s*[A-za-z]+)\\s*\\|\\s*(\\d+)\\s*\\|\\s*(\\d+\\.?\\d*).*");
			Matcher m = p.matcher(newLine);
			
			if (m.matches()) {
				ArrayList<String> newList = new ArrayList<>();
				newList.add(m.group(1));
				
				if (studentsResults.containsKey(m.group(2))) {
					newList.addAll(studentsResults.get(m.group(2)));
				}	
				studentsResults.put(m.group(2), newList);
				
				if (scoreMap.containsKey(m.group(2))) {
					scoreMap.put(m.group(2), scoreMap.get(m.group(2))+ Double.parseDouble(m.group(3)));
				} else {
					scoreMap.put(m.group(2), Double.parseDouble(m.group(3)));
				}
				
			}
			
		} while (! newLine.contains("-"));
		
		for (String score : studentsResults.keySet()) {
			ArrayList<String> newList = studentsResults.get(score);
			Collections.sort(newList);
			System.out.print(score + " -> ");
			System.out.print(newList);
			double avg = scoreMap.get(score)/newList.size();
			System.out.printf("; avg=%.2f",avg);
			System.out.println();
		}
		
		input.close();
		
	}
}
