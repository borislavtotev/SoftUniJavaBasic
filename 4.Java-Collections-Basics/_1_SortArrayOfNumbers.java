import java.util.Arrays;
import java.util.Scanner;


public class _1_SortArrayOfNumbers {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		input.nextLine();
		
		int[] values = new int[n];
		for (int i = 0; i < n; i++) {
			values[i] = input.nextInt(); 
		}
		
		Arrays.sort(values);
		
		for (int i : values) {
			System.out.print(" " + i);
		}
		input.close();
	}
}
