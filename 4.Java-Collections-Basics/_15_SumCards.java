import java.util.HashMap;
import java.util.Scanner;


public class _15_SumCards {
	public static void main(String[] args) {
		HashMap<String,Integer> cardValues = new HashMap<>();
		cardValues.put("2",2);
		cardValues.put("3",3);
		cardValues.put("4",4);
		cardValues.put("5",5);
		cardValues.put("6",6);
		cardValues.put("7",7);
		cardValues.put("8",8);
		cardValues.put("9",9);
		cardValues.put("10",10);
		cardValues.put("J",12);
		cardValues.put("Q",13);
		cardValues.put("K",14);
		cardValues.put("A",15);		
		
		Scanner input = new Scanner(System.in);
		String newHand = input.nextLine();
		input.close();
		
		String[] cards = newHand.split(" ");
		
		long sum = 0;
		
		for (int i = 0; i < cards.length; i++) {
			String face = cards[i].substring(0,cards[i].length()-1);
			
			if ( (i-1)>=0 && (face.equals(cards[i-1].substring(0,cards[i-1].length()-1)))) {
				sum+=cardValues.get(face)*2;
			} else if (( (i+1)<cards.length && (face.equals(cards[i+1].substring(0,cards[i+1].length()-1))))) {
				sum+=cardValues.get(face)*2;	
			} else	{
				sum+=cardValues.get(face);
			}

		}
		System.out.println(sum);
	}
}
