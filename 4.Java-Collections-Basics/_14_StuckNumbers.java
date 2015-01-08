import java.util.Scanner;

public class _14_StuckNumbers {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		input.nextLine();
		
		int[] numbers = new int[n];
		for (int i = 0; i < n; i++) {
			numbers[i]=input.nextInt();
		}
		
		input.close();
		
		int count = 0;
		
		for (int i = 0; i < numbers.length; i++) {
			int a = numbers[i];
			
			for (int j = 0; j < numbers.length; j++) {
					
				int b = numbers[j];
				
				for (int k = 0; k < numbers.length; k++) {
					
					int c = numbers[k];
					
					for (int l = 0; l < numbers.length; l++) {
						int d = numbers[l];
						
						if ((d==a) || (d==b) || (d==c) || (c==b) || (c==a) || (b==a) ) {
							continue;
						}
						
						String first = "" + a + b;
						String second = "" + c + d;
						if (first.equals(second)) {
							System.out.printf("%d|%d==%d|%d\n",
								a, b, c, d);
							count++;
						}	
					}
				}
				
			}
		} 
		
		if (count == 0 ) {
			System.out.println("No");
		} 
		
	}
}
