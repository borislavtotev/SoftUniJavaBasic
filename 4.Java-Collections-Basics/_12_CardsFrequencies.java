import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;


public class _12_CardsFrequencies {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String inputStr = input.nextLine();
		input.close();
		
		String[] inputElements = inputStr.split(" ");
		
		HashMap<String,Integer> faces = new HashMap<>();
		
		for (String string : inputElements) {
			String newFace;
			if (string.substring(0,1).equals("1")) {
				newFace = string.substring(0,2);
			} else {
				newFace = string.substring(0,1);
			}

			if (faces.containsKey(newFace)) {
				faces.put(newFace, faces.get(newFace)+1);
			} else {
				faces.put(newFace, 1);
			}
		}
		
		HashSet<String> printed = new HashSet<>();
		
		for (String string : inputElements) {
			String newFace;
			if (string.substring(0,1).equals("1")) {
				newFace = string.substring(0,2);
			} else {
				newFace = string.substring(0,1);
			}
			if (! printed.contains(newFace)) {
				float percantage = (float)100*faces.get(newFace)/inputElements.length;
				System.out.printf(newFace + " -> %.2f" + "%%", percantage);
				System.out.println();
				printed.add(newFace);
			} 
		}
	}
}
