import java.text.DecimalFormat;
import java.util.Scanner;


public class _4_SmallerOfThreeNumbers {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please add three numbers:");
		System.out.print("a=");
		float a = input.nextFloat();
		input.nextLine();
		float min = a;
		System.out.print("b=");
		float b = input.nextFloat();
		input.nextLine();
		
		if (b<a) {
			min = b;
		}
		
		System.out.print("c=");
		float c = input.nextFloat();
		input.nextLine();
		input.close();
		
		if (c<min) {
			min = c;
		}
		DecimalFormat df = new DecimalFormat("#.#######");
		String minStr = df.format(min);
		System.out.printf("The smallest number is %s",minStr);
	}
}
