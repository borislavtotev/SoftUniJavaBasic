import java.util.List;

import org.paukov.combinatorics.Factory;
import org.paukov.combinatorics.Generator;
import org.paukov.combinatorics.ICombinatoricsVector;

public class _4_FullHouseWithJokers {
	public static void main(String[] args) {
		String[] Cards = new String[]{"2", "3", "4", "5", "6", "7", "8", "9", "10", "J",
				"Q", "K", "A"};
		
		String[] Suits = new String[]{"♣", "♦", "♥", "♠"};
		
		ICombinatoricsVector<String> initialVector = Factory.createVector(Suits); 
		
		Generator<String> gen = Factory.createSimpleCombinationGenerator(initialVector, 3);
		List<ICombinatoricsVector<String>> ThreeSuitCombinations = gen.generateAllObjects();
		
		gen = Factory.createSimpleCombinationGenerator(initialVector, 2);	
		List<ICombinatoricsVector<String>> TwoSuitCombinations = gen.generateAllObjects();
				
		int count = 0;
		
		for (int i = 0; i < Cards.length; i++) {
			for (int j = 0; j < Cards.length; j++) {
				if (Cards[i] == Cards[j]) {
					continue;
				} else {
					for (ICombinatoricsVector<String> ThreeSuitCombination : ThreeSuitCombinations) {
						for (ICombinatoricsVector<String> TwoSuitCombination : TwoSuitCombinations) {
							//Print the results for _3_FullHouse: System.out.println("(" + Cards[i] + ThreeSuitCombination.getValue(0) + " " + Cards[i] + ThreeSuitCombination.getValue(1) + " " + Cards[i] + ThreeSuitCombination.getValue(2) + " " + Cards[j] + TwoSuitCombination.getValue(0) + " " + Cards[j] + TwoSuitCombination.getValue(1) + ")");
							String[] GeneratedCards = new String[] {Cards[i] + ThreeSuitCombination.getValue(0), Cards[i] + ThreeSuitCombination.getValue(1), Cards[i] + ThreeSuitCombination.getValue(2), Cards[j] + TwoSuitCombination.getValue(0), Cards[j] + TwoSuitCombination.getValue(1)};
							
							ICombinatoricsVector<String> initialVector1 = Factory.createVector(GeneratedCards); 
							Generator<String> genNew;
						
							for (int k = 0; k <= 5; k++) {
								genNew = Factory.createSimpleCombinationGenerator(initialVector1, 5-k);
								List<ICombinatoricsVector<String>> CreatedCombinations = genNew.generateAllObjects();
								
								String jokers = "";
								for (int l = 1; l <= k; l++) {
									jokers += " *";
								}
								 
								for (ICombinatoricsVector<String> iCombinatoricsVector : CreatedCombinations) {
									for (int m = 0; m < (5-k); m++) {
										System.out.print(" " + iCombinatoricsVector.getValue(m));
									}
									System.out.println(jokers);
									count++;
								}
							}
							
							
						}
					}
				}
			}
		}
		System.out.println(count + " full houses");
	}
}
