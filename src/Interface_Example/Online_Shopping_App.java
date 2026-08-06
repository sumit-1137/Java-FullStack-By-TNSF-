package Interface_Example;

import java.util.Arrays;
import java.util.Scanner;

// Abstract Base Class
abstract class Product {
    String name;
    Float price;
	
    public Product(String name, Float price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product [Name=" + name + ", Original Price=" + price + "]";
    }

    abstract void calculateDiscount(int discountAmount);
	
    public String getName() {
        return name;
    }
}

// Subclasses implementing abstract method
class Electronic extends Product {
    public Electronic(String name, Float price) {
        super(name, price);
    }

    @Override
    void calculateDiscount(int x) {
        System.out.println("Discount on Electronic: ₹" + x);
        float disPrice = price - x;
        System.out.println("Final discounted price: ₹" + disPrice);
    }
}

class Grocery extends Product { // Fixed spelling from Groccery
    public Grocery(String name, Float price) {
        super(name, price);
    }

    @Override
    void calculateDiscount(int x) {
        System.out.println("Discount on Grocery: ₹" + x);
        float disPrice = price - x;
        System.out.println("Final discounted price: ₹" + disPrice);
    }
}

class Clothing extends Product {
    public Clothing(String name, Float price) {
        super(name, price);
    }

    @Override
    public void calculateDiscount(int x) {
        System.out.println("Discount on Clothing: ₹" + x); // Fixed spelling from Clothig
        float disPrice = price - x;
        System.out.println("Final discounted price: ₹" + disPrice);
    }
}

// Main Driver Class
public class Online_Shopping_App {
	
    public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);
        Product product[] = new Product[3];
	       
        System.out.println("********* Enter Product Details ************");
        for (int i = 0; i < product.length; i++) {
	    	 
            System.out.println("\nItem " + (i + 1) + ":");
            System.out.print("Select Category (1: Electronic, 2: Grocery, 3: Clothing): ");
            int category = sc.nextInt();
            sc.nextLine(); // Clear buffer
            
            System.out.print("Enter the Product Name: ");
            String name = sc.nextLine();
	    	 
            System.out.print("Enter the Product Price: ");
            float price = sc.nextFloat();
            sc.nextLine(); // Clear buffer
	    	 
            // CRITICAL FIX: Instantiate specific product object and assign it to the array
            if (category == 1) {
                product[i] = new Electronic(name, price);
            } else if (category == 2) {
                product[i] = new Grocery(name, price);
            } else if (category == 3) {
                product[i] = new Clothing(name, price);
            } else {
                System.out.println("Invalid Category! Defaulting to Generic Electronic.");
                product[i] = new Electronic(name, price);
            }
        } 
	     
        // Display entered data
        System.out.println("\n********* All Products ************");
        System.out.println(Arrays.toString(product));
        
        // Testing the abstract method polymorphically
        System.out.println("\n********* Processing Discounts ************");
        for (Product prod : product) {
            System.out.println("\nProduct Name: " + prod.getName());
            prod.calculateDiscount(50); // Applies a ₹50 discount to each item
        }
	      
        sc.close();
    }
}
