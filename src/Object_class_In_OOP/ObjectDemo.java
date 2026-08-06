package Object_class_In_OOP;

public class ObjectDemo {
	
	  @Override
	  public String toString() 
	  { 
		  return ("Hello World");
	  }
	  
	  
	  public int hashCode() {
		  return 1;
		  
	  }
	 
	
	
public static void main(String[] args) {
	
	ObjectDemo obj1 = new ObjectDemo();
	System.out.println(obj1);
	System.out.println(obj1.toString());
	System.out.println(obj1.hashCode());
	System.out.println(obj1.getClass());
	
	
	//we can @override Object class methods
	
}
}
