import java.util.Scanner;


public class _6_FormatiingNumbers {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please add three numbers:");
		System.out.print("a=");
		int a = input.nextInt();
		input.nextLine();
		System.out.print("b=");
		float b = input.nextFloat();
		input.nextLine();
		System.out.print("c=");
		float c = input.nextFloat();
		input.nextLine();
		input.close();
		
		System.out.printf("|%-10s|",Integer.toHexString(a).toUpperCase());
		System.out.printf("%010d|",Integer.parseInt(Integer.toBinaryString(a)));
		System.out.printf("%10.2f|",b);
		System.out.printf("%-10.3f|",c);
	}


}
