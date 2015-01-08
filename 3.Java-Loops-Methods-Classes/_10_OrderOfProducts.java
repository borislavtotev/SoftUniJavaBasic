import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class _10_OrderOfProducts {
	public IOException x;
	public static void main(String[] args) {
		try  {
			//Products.txt
			FileInputStream fis = new FileInputStream("./Products.txt");
			BufferedReader br = new BufferedReader(new InputStreamReader(fis));
			
			String line = null;
			List<Product> allProducts = new ArrayList<Product>();
			
		    while ((line = br.readLine()) != null) {
		        Product newProduct = Product.scannerProduct(line);
		        allProducts.add(newProduct);
		    }
		    
		    fis.close();
		    br.close();
		       
		    //Order.txt
		    
			FileInputStream fis1 = new FileInputStream("./Order.txt");
			BufferedReader br1 = new BufferedReader(new InputStreamReader(fis1));
			
			line = null;
			double sum = 0;
			
		    while ((line = br1.readLine()) != null) {
				Pattern p = Pattern.compile("([0-9]*\\.?[0-9]+)\\s+(\\w+).*");
				Matcher m = p.matcher(line);

				if (m.matches()) {
					String orderName = m.group(2);
					Double orderQuality = new Double(m.group(1));
					
					for (Product product : allProducts) {
						String productName = product.getName();
						if (productName.equalsIgnoreCase(orderName)) {
							sum += orderQuality * product.getPrice();
							break;
						} 
					}
				}
				else {
					throw new IOException();
				}
		    }
		    
		    fis1.close();
		    br1.close();
		    
	        try {
	          File file = new File("Output.txt");
	          BufferedWriter output = new BufferedWriter(new FileWriter(file));
	          output.write(Double.toString(sum));
	          output.close();
	        } catch ( IOException e ) {
	           e.printStackTrace();
	        }
		    
		    //System.out.println(sum);
		    
		} catch (IOException x) {
		    System.err.format("Error");
		}		
	}
}