import java.util.Scanner;


public class _1_SymmetricNumbersInRange {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int start = input.nextInt();
		int end = input.nextInt();
		
		for (int i = start; i <= end; i++) {
			String iStr = String.valueOf(i);
			char[] numbers = iStr.toCharArray();
			
			Boolean simetric = true;
			
			for (int j = 0; j < (numbers.length/2); j++) {
				if (numbers[j] != numbers[numbers.length-1-j]) {
					simetric = false;
				}
			}
			
			if (simetric) {
				System.out.println(i);
			}
		}
		input.close();
	}
}
