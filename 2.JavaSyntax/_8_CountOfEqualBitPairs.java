import java.util.Scanner;


public class _8_CountOfEqualBitPairs {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		input.nextLine();
		input.close();
		
		int count = 0;
		String nStr = Integer.toBinaryString(n);
		
		for (int i = 0; i < nStr.length()-1; i++) {	
			if (nStr.charAt(i) == nStr.charAt(i+1)) {
				count++;
			}
		}
		
		System.out.println(count);
	}
}
