import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.*;

public class _3_Largest3Rectangles {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String newLine = input.nextLine();
		newLine = newLine.replaceAll("\\s+", "");

		Pattern p = Pattern.compile("\\[(\\d+)x(\\d+)\\]");
		Matcher m = p.matcher(newLine);

		ArrayList<Long> allValues = new ArrayList<>();
		
		while (m.find()) {
			int a = Integer.parseInt(m.group(1));
			int b = Integer.parseInt(m.group(2));
			allValues.add((long) (a*b));
		}

		long area = Integer.MIN_VALUE;
		
		for (int i = 0; i < allValues.size()-2; i++) {
			long curArea = allValues.get(i) + allValues.get(i+1) + allValues.get(i+2);
			if (curArea > area) {
				area = curArea;
			}
		}
		System.out.println(area);
	}
}
