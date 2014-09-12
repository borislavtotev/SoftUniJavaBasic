import java.util.Scanner;


public class _7_CountOfBits1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		input.nextLine();
		input.close();
		
		int count = 0;
		int newN;
		
		for (int i = 0; i < 16; i++) {
			newN = n >> i;
			if ((newN & 1)==1) {
				count++;
			}
		}
		
		System.out.println(count);
	}
}
