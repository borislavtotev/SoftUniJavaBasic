import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class _9_CombineListsOfLetters {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String inputStr1 = input.nextLine();
		String inputStr2 = input.nextLine();
		input.close();
		
		inputStr1 = inputStr1.replace(" ", "");
		inputStr2 = inputStr2.replace(" ", "");
		
		List<Character> l1 = new ArrayList<>();
		
		for (int i = 0; i < inputStr1.length(); i++) {
			l1.add(inputStr1.charAt(i));
		}

		List<Character> l2 = new ArrayList<>();
		
		for (int i = 0; i < inputStr2.length(); i++) {
			l2.add(inputStr2.charAt(i));
		}
		
		List<Character> l3 = new ArrayList<>();
		l3.addAll(l1);
		
		for (int i = 0; i < inputStr2.length(); i++) {
			char curChar = inputStr2.charAt(i);
			if (! l1.contains(curChar)) {
				l3.add(inputStr2.charAt(i));				
			}
		}
		
		for (int i = 0; i < l3.size(); i++) {
			System.out.print(l3.get(i)+ " ");
		}
		
	}
}
