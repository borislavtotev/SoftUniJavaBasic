import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;


public class _8_SumNumbersFromATextFile {
	public static void main(String[] args) {
		try  {
			FileInputStream fis = new FileInputStream("./inputInt.txt");
			BufferedReader br = new BufferedReader(new InputStreamReader(fis));
			
			String line = null;
			
			long sum = 0;
			
		    while ((line = br.readLine()) != null) {
		        int newValue = Integer.parseInt(line);
		        sum += newValue;
		    }
	    	System.out.println(sum);
		    br.close();
		} catch (IOException x) {
		    System.err.format("Error");
		}	
	}
}
