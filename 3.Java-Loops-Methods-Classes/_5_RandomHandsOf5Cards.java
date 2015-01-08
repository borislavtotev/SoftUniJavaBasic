import java.util.Random;
import java.util.Scanner;


public class _5_RandomHandsOf5Cards {
	public static void main(String[] args) {
		
		String[] Cards = new String[]{"2", "3", "4", "5", "6", "7", "8", "9", "10", "J",
				"Q", "K", "A"};
		
		String[] Suits = new String[]{"♣", "♦", "♥", "♠"};
		
		String[] FullCards = new String[52];
		
		int cardNumber = 0;
		
		for (int i = 0; i < Cards.length; i++) {
			for (int j = 0; j < Suits.length; j++) {
				FullCards[cardNumber] = Cards[i] + Suits[j];
				//System.out.println(FullCards[cardNumber]);
				cardNumber++;
			}
		}
		
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		input.nextLine();
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < 5; j++) {
				Random rand = new Random();
				int randomNum = rand.nextInt(52);
				System.out.print(" " + FullCards[randomNum]);
			}
			System.out.println();
		}
		
		input.close();
		
	}
}
