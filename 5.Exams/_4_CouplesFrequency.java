import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;


public class _4_CouplesFrequency {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String newLine = input.nextLine();
		input.close();
		String[] values = newLine.split("\\s+");
		
		HashMap<String,Integer> map = new HashMap<>();
		
		
		for (int i = 0; i < values.length-1; i++) {
			String couple = values[i]+" "+values[i+1];
			
			if (map.containsKey(couple)) {
				int times = map.get(couple);
				map.put(couple, times+1);
			} else {
				map.put(couple, 1);
			}
		}
		
		HashSet<String> printed = new HashSet<>();
		
		for (int i = 0; i < values.length-1; i++) {
			String couple = values[i]+" "+values[i+1];
			if (! printed.contains(couple)) {
				double percentage = (double)map.get(couple)/(values.length-1)*100;
				System.out.printf("%s -> %.2f%%\n",couple,percentage);
				printed.add(couple);
			}
		}
		
	}
}
