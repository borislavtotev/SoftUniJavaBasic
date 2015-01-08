import java.util.Scanner;
import java.util.regex.*;

public class _1_VideoDurations {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String newLine;

		long hours = 0;
		long minutes = 0;

		while (!(newLine = input.nextLine()).contains("End")) {
			Pattern p = Pattern.compile("(\\d+):(\\d+)");
			Matcher m = p.matcher(newLine);

			while (m.find()) {
				hours += Integer.parseInt(m.group(1));
				minutes += Integer.parseInt(m.group(2));
			}
		}
		
		input.close();
		
		//System.out.println(hours);
		hours += (minutes / 60);
		//System.out.println(minutes);
		minutes = minutes % 60;
		//System.out.println(minutes);
		
		System.out.printf("%d:%02d\n",hours,minutes);

	}
}
