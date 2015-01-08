import java.util.Scanner;


public class _2_PythagoreanNumbers {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		
		int[] numbers = new int[n];
		for (int i = 0; i < n; i++) {
			numbers[i] = input.nextInt();
		}
		
		int count = 0;
		for (int i = 0; i < numbers.length; i++) {
			int a = numbers[i];
			for (int j = 0; j < numbers.length; j++) {
				int b = numbers[j];
				for (int k = 0; k < numbers.length; k++) {
					int c = numbers[k];
					
					if ( (a*a+b*b) == c*c && (a<=b)) {
						System.out.printf("%d*%d + %d*%d = %d*%d\n",a,a,b,b,c,c);
						count++;
					}
				}
			}
		}
		if (count == 0) {
			System.out.println("No");
		}
	}
}
