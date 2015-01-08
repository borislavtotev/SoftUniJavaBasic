import java.util.*;


public class _2_SequencesOfEqualStrings {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String inputStr = input.nextLine();	

		String[] Elements = inputStr.split(" ");
			
		String lastElement = null;
		
		for (int i = 0; i < Elements.length; i++) {
			if (lastElement == null) {
				System.out.print(Elements[i]);
				lastElement = Elements[i];
			} else if (lastElement.equals(Elements[i])) {
				System.out.print(" " + Elements[i]);
			}
			else {
				System.out.println();
				System.out.print(Elements[i]);
				lastElement = Elements[i];
			}
		}

		input.close();
	}
}	
