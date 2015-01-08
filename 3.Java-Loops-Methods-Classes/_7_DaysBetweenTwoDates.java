import java.text.*;
import java.util.*;
import java.util.concurrent.TimeUnit;


public class _7_DaysBetweenTwoDates {
	public static void main(String[] args) {
	      SimpleDateFormat ft = new SimpleDateFormat ("dd-MM-yyyy"); 
	      
	      Scanner input = new Scanner(System.in);	      
	      String firstDateStr = input.nextLine();
	      String secondDateStr = input.nextLine();
	      
	      Date firstDate;
	      Date secondDate;
	      
	      try { 
	          firstDate = ft.parse(firstDateStr);
	          secondDate = ft.parse(secondDateStr);
	          long diff = secondDate.getTime() - firstDate.getTime();
	          System.out.println (TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS));
	          System.out.println(diff/(1000*60*60*24));
	      } catch (ParseException e) { 
	          System.out.println("Unparseable using " + ft); 
	      }
	      input.close();
	}
}
