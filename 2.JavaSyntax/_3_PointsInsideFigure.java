import java.util.Scanner;


public class _3_PointsInsideFigure {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		
		//do {
			float x = input.nextFloat();
			float y = input.nextFloat();
			input.nextLine();
			
			if ( (x>=12.5 && x <=22.6 && y>=6 && y<=8.5) || (x>=12.5 && x<=17.5 && y>=8.5 && y<=13.5) || (x>=20 && x<=22.5 && y>=8.5 && y<=13.5)) {
				System.out.println("Inside");
			} else {
				System.out.println("Outside");
			}
		//} while (true);
			input.close();
	}
}
