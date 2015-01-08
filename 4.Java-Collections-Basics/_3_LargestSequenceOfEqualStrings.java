import java.util.Scanner;
public class _3_LargestSequenceOfEqualStrings {
	
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	String str = input.nextLine();
	String[] arrStr = str.split(" ");
	
	int longestSequence = 1; 
	int index = 0; 
	int tempLongestSequence = 1;
	
	for (int i = 1; i < arrStr.length; i++) {
		if (arrStr[i].equals(arrStr[i - 1])) {
			tempLongestSequence++;
		} else {
			tempLongestSequence = 1;
		}
	
		if (tempLongestSequence > longestSequence) {
			longestSequence = tempLongestSequence;
			index = i-longestSequence+1;
		}
	}
	
	for (int i = 0; i < longestSequence; i++) {
		System.out.print(arrStr[index] + " ");
	}
	
	input.close();
 }
}
