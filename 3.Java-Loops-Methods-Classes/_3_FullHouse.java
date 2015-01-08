
public class _3_FullHouse {
	public static void main(String[] args) {
		String[] Cards = new String[]{"2", "3", "4", "5", "6", "7", "8", "9", "10", "J",
				"Q", "K", "A"};
		
		String[] Suits = new String[]{"♣", "♦", "♥", "♠"};
		String[][] ThreeSuitCombinations = GetThreeSuitCombinations(Suits);
		String[][] TwoSuitCombinations = GetTwoSuitCombinations(Suits);
		
		int count = 0;
		
		for (int i = 0; i < Cards.length; i++) {
			for (int j = 0; j < Cards.length; j++) {
				if (Cards[i] == Cards[j]) {
					continue;
				} else {
					for (String[] ThreeSuitCombination : ThreeSuitCombinations) {
						for (String[] TwoSuitCombination : TwoSuitCombinations) {
							System.out.println("(" + Cards[i] + ThreeSuitCombination[0] + " " + Cards[i] + ThreeSuitCombination[1] + " " + Cards[i] + ThreeSuitCombination[2] + " " + Cards[j] + TwoSuitCombination[0] + " " + Cards[j] + TwoSuitCombination[1] + ")");
							count++;
						}
					}
				}
			}
		}
		System.out.println(count + " full houses");
	}
	public static String[][] GetThreeSuitCombinations(String[] AllSuits){
		String[][] SuitCombinations = new String[4][3];
		
		int count = 0;
		
		for (int i = 0; i < AllSuits.length; i++) {
			for (int j = i+1; j < AllSuits.length; j++) {
				for (int j2 = j+1; j2 < AllSuits.length; j2++) {
					SuitCombinations[count] = new String[]{AllSuits[i],AllSuits[j],AllSuits[j2]}; 
					count++;
				}
			}
		}
		
		return SuitCombinations;
	}
	public static String[][] GetTwoSuitCombinations(String[] AllSuits){
		String[][] SuitCombinations = new String[6][2];
		
		int count = 0;
		
		for (int i = 0; i < AllSuits.length; i++) {
			for (int j = i+1; j < AllSuits.length; j++) {
				SuitCombinations[count] = new String[]{AllSuits[i],AllSuits[j]};
				count++;
			}
		}
		
		return SuitCombinations;
	}
}
