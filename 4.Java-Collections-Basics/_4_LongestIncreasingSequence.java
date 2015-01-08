import java.util.Scanner;


public class _4_LongestIncreasingSequence {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String str = input.nextLine();
		String[] arrStr = str.split(" ");
		int[] arrInt = new int[arrStr.length];
		
		for (int i = 0; i < arrStr.length; i++) {
			arrInt[i] = Integer.parseInt(arrStr[i]);
		}
		
		int longestSequence = 1; 
		int index = 0; 
		int tempLongestSequence = 1;
		
		System.out.print(" " + arrInt[0]);
		
		for (int i = 1; i < arrInt.length; i++) {
			if (arrInt[i] > arrInt[i - 1]) {
				tempLongestSequence++;
				System.out.print(" " + arrInt[i]);
			} else {
				tempLongestSequence = 1;
				System.out.println();
				System.out.print(" " + arrInt[i]);
			}
		
			if (tempLongestSequence > longestSequence) {
				longestSequence = tempLongestSequence;
				index = i-longestSequence+1;
			}
		}
		
		System.out.println();
		System.out.print("Longest: ");
		
		for (int i = 0; i < longestSequence; i++) {
			System.out.print(arrInt[index+i] + " ");
		}
		input.close();
	 }
	}