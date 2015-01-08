import java.text.DecimalFormat;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.*;


public class _5_AngleUnitConverter {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String FirstLine = input.nextLine();
		int n = Integer.parseInt(FirstLine);
		
		String[] outPut = new String[n];
		
		for (int i = 0; i < n; i++) {
			String nextLine = input.nextLine();
			
			Pattern p = Pattern.compile("([0-9]*\\.?[0-9]+).*");
			Matcher m = p.matcher(nextLine);
			
			double number = 0;
			
			if (m.matches()) {
				number = Double.parseDouble(m.group(1));	
				if (nextLine.contains("deg")) {
					outPut = ConvertDegreesToRadians(number,outPut,i);
				} else if (nextLine.contains("rad")) {
					outPut = ConvertRadiansToDegrees(number,outPut,i);
				} else {
					System.out.println("Wrong input");
					break;
				}
			}
		}
		input.close();
		
		for (int i = 0; i < outPut.length; i++) {
			System.out.println(outPut[i]);
		}
		
	}

	private static String[] ConvertDegreesToRadians(double number,
			String[] outPut, int i) {
		
		double radians = number * Math.PI / 180;
		
		DecimalFormat dForm = new DecimalFormat("0.000000");
		
		outPut[i] = dForm.format(radians) + " rad";

		return outPut;		
	}

	private static String[] ConvertRadiansToDegrees(double number,
			String[] outPut, int i) {
		
		double degrees = number * 180 / Math.PI;
			
		DecimalFormat dForm = new DecimalFormat("0.000000");
		
		outPut[i] = dForm.format(degrees) + " deg";
		
		return outPut;
	}
}
