import java.util.Scanner;


public class _13_Durts {
	 public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int cx = input.nextInt();
		int cy = input.nextInt();
		int r = input.nextInt();
		int n = input.nextInt();
		
		int[] points = new int[2*n];
		
		for (int i = 0; i < n*2; i++) {
			points[i] = input.nextInt();
		}
		input.close();
		
		
		for (int i = 0; i < points.length; i=i+2) {
			int x = points[i];
			int y = points[i+1];
			
			boolean inside = false;
			
			if ( (x>=(cx-r/2)) && (x<=(cx+r/2)) && (y>=(cy-r)) && (y<=(cy+r)) ) {
				inside = true;
			}
			
			if ( (x>=(cx-r)) && (x<=(cx-r/2)) && (y>=(cy-r/2)) && (y<=(cy+r/2)) ) {
				inside = true;
			}
			
			if ( (x>=(cx+r/2)) && (x<=(cx+r)) && (y>=(cy-r/2)) && (y<=(cy+r/2)) ) {
				inside = true;
			}
			
			if (inside) {
				System.out.println("yes");
			} else {
				System.out.println("no");
			}
		}
		
	}
}
