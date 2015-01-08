import java.util.Scanner;


public class _7_CountSubstringOccurences {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String inputStr = input.nextLine();
		String searchStr = input.nextLine();
		input.close();
		
		int fromIndex = 0;
		int count = 0;
		inputStr = inputStr.toLowerCase();
		searchStr = searchStr.toLowerCase();
		
		while (inputStr.indexOf(searchStr, fromIndex) != -1) {
			count++;
			fromIndex = inputStr.indexOf(searchStr, fromIndex)+1;
		}
		System.out.println(count);
	}
}
