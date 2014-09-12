import java.util.Arrays;
import java.util.Scanner;


public class SortArrayOfStrings {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		
		String[] strArray = new String[num];
		
		input.nextLine();
		
		for (int i = 0; i < num; i++) {
			strArray[i] = input.nextLine();
		}
		
		
		Arrays.sort(strArray);
		
		for (int i = 0; i < strArray.length; i++) {
			System.out.println(strArray[i]);
		}
		
		input.close();//input.close();
		
	}
}
