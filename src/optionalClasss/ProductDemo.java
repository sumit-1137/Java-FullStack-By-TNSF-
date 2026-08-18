package optionalClasss;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Product{
	int id;
	String name;
	
	public Product(String name ) {
		this.name = name;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Product id=");
		builder.append(id);
		builder.append(", name=");
		builder.append(name);
		
		return builder.toString();
	}
	
	
}
public class ProductDemo {
	public static void main(String[] args) {
		
		List<String> item = Arrays.asList("Pen","Book","Bag","Bottle","Bag");
		
		List<Product> product = new ArrayList();
		System.out.println("Using Stream Class ");
		product  = item.stream().map(str ->new Product(str)).toList();
		System.out.println(product);
		
		System.out.println("using Constructor Ref ");
		item.stream().map(Product :: new).toList();
		for(String e : item) {
			System.out.println(e);
		}
	}

}
