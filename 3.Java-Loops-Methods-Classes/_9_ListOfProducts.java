import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _9_ListOfProducts {
	public IOException x;
	public static void main(String[] args) {
		try  {
			FileInputStream fis = new FileInputStream("./input.txt");
			BufferedReader br = new BufferedReader(new InputStreamReader(fis));
			
			String line = null;
			List<Product> allProducts = new ArrayList<Product>();
			
		    while ((line = br.readLine()) != null) {
		        Product newProduct = Product.scannerProduct(line);
		        allProducts.add(newProduct);
		    }
		    br.close();
		        
		    Collections.sort(allProducts, new Comparator<Product>(){
		        public int compare(Product o1, Product o2){
		            if(o1.price == o2.price)
		                return 0;
		            return (o1.price < o2.price ? -1 : 1);
		        }
		    });
		    
		    for (Product product : allProducts) {
		        Product.printProduct(product);
			}
		} catch (IOException x) {
		    System.err.format("Error");
		}		
	}
}
class Product {
	private String name;
	Double price;

	public Product(String name, Double price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
	
	public static void printProduct(Product newProduct) {
		System.out.printf("%.2f %s\n", newProduct.price,newProduct.name);
	}

	public static Product scannerProduct(String newLine) throws IOException {
		//System.out.println(newLine);
		Pattern p = Pattern.compile("(\\w+)\\s+([0-9]*\\.?[0-9]+).*");
		Matcher m = p.matcher(newLine);

		if (m.matches()) {
			String name = m.group(1);
			Double price = new Double(m.group(2));
			return new Product(name, price);	
		}
		else {
			throw new IOException();
		}		
	}
}
