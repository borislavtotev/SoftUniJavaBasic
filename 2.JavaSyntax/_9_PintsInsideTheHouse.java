import java.util.Scanner;

public class _9_PintsInsideTheHouse {
	public static void main(String[] args) {	
		Scanner input = new Scanner(System.in);
		
		//do {
			float x = input.nextFloat();
			float y = input.nextFloat();
			input.nextLine();

			if ( (x>=12.5 && x <=17.5 && y>=8.5 && y<=13.5) || (x>=20 && x<=22.5 && y>=8.5 && y<=13.5) || (isInProperSide(12.5f, 8.5f, 17.5f, 3.5f, x, y, "left") && isInProperSide(12.5f, 8.5f, 22.5f, 8.5f, x, y, "right") && isInProperSide(22.5f, 8.5f, 17.5f, 3.5f, x, y, "right")) ) {
				System.out.println("Inside");
			} else {
				System.out.println("Outside");
			}
		//} while (true);
			input.close();
	}
	public static Boolean isInProperSide(float ax, float ay, float bx, float by, float cx, float cy, String side){
	    if (side == "right") {
	    	return ((bx - ax)*(cy - ay) - (by - ay)*(cx - ax)) <= 0;
		} else {
			return ((bx - ax)*(cy - ay) - (by - ay)*(cx - ax)) >= 0;
		} 
	}
}
