import java.math.BigDecimal;
import java.util.Scanner;
import java.util.regex.*;

public class _16_SimpleExpression {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String inputStr = input.nextLine();
		input.close();
		inputStr = inputStr.replaceAll("\\s+", "");

		Pattern p = Pattern.compile("(^|[+-])([0-9]*\\.?[0-9]+)+");
		Matcher m = p.matcher(inputStr);

		BigDecimal sum = BigDecimal.ZERO;
		while (m.find()) {
			BigDecimal newValue = new BigDecimal(m.group(0));
			sum = sum.add(newValue);
		}

		System.out.printf("%.7f\n",sum);

	}
}
