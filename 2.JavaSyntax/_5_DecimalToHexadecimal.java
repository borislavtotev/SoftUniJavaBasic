import java.util.Scanner;


public class _5_DecimalToHexadecimal {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		input.nextLine();
		input.close();
		
		String hex = Integer.toHexString(n);
		System.out.println(hex.toUpperCase());
	}
}
