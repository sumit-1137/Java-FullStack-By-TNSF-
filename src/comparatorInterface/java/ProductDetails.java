package comparatorInterface.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Product{
	int id;
	String name;
	float price;
	int stock;
	
	public Product(int id,String name,float price,int stock) {
		this.id = id;
		this.name = name;
		this.price= price;
		this.stock = stock;
	}

	@Override
	public String toString() {
		return " id=" + id + ", name=" + name + ", price=" + price + ", stock=" + stock +"\n";
	}
	
	
}
public class ProductDetails {
	public static void main(String[] args) {
		
		List <Product>item = new ArrayList();
		item.add(new Product(1,"Bag",250,10));
		item.add(new Product(4,"Bottle",200,10));
		item.add(new Product(6,"Ball",50,10));
		item.add(new Product(4,"Pen",20,10));
		item.add(new Product(8,"umbrella",250,10));
		item.add(new Product(2,"Ballpen",25,10));
		
	//using name length
		
	 Comparator<Product> com1 = (
				  a,b)->Integer.compare(a.name.length(),b.name.length());
				  
				  Collections.sort(item,com1); 
				  for(Object obj :item) {
				  System.out.println(item);
				  
				  
		 }
				  
		//using lambda function
		Comparator<Product> com = (a,b)->Integer.compare(a.id,b.id);
		Collections.sort(item,com);
		System.out.println(item);
		
		
		
		
		
		
		
	}

}
