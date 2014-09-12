import java.util.Scanner;


public class SumTwoNumbers {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int firstNum = input.nextInt();
		int secountNum = input.nextInt();
		
		System.out.println(firstNum+secountNum);
		input.close();
		
	}
}
