import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;


public class _15_StraightFlush {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String inputLine = input.nextLine();
		input.close();
		
		ArrayList<String> cardFaces = new ArrayList<String>(Arrays.asList("2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"));
		
		String[] cards = inputLine.split("\\W+");
		
		HashMap<String,ArrayList<Integer>> cardsMap = new HashMap<>();
		
		for (String card : cards) {
			String suit = card.substring(card.length()-1);
			String faceStr = card.substring(0, card.length()-1);
			int faceInt = cardFaces.indexOf(faceStr);
			
			if (cardsMap.containsKey(suit)) {
				cardsMap.get(suit).add(faceInt);
			} else {
				cardsMap.put(suit,new ArrayList<Integer>());
				cardsMap.get(suit).add(faceInt);
			}
		}
		
		int numFlushes = 0;
		for (String suit : cardsMap.keySet()) {
			ArrayList<Integer> cardList = cardsMap.get(suit);
			Collections.sort(cardList);
			
			for (int i = 0; i < cardList.size()-4; i++) {
				ArrayList<String> flushes = new ArrayList<>();
				int faceInt = cardList.get(i);
				
				String faceStr = cardFaces.get(faceInt);
				flushes.add(faceStr+suit);
				
				for (int j = i+1; j < i+5; j++) {
					if ((cardList.get(j)-cardList.get(j-1)==1)) {
						faceInt = cardList.get(j);
						faceStr = cardFaces.get(faceInt);
						flushes.add(faceStr+suit);
					}
				}

				if (flushes.size() == 5) {
					System.out.println(flushes);
					numFlushes++;
				}
				
			}
		}
		if (numFlushes == 0) {
			System.out.println("No Straight Flushes");
		}
			
	}
}
