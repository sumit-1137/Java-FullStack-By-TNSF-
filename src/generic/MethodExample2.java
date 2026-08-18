package generic;

class Box<T>{
	T value;
	
	void set(T value) {
		this.value = value;
		
	}
	
	T get() {
		return value;
		
	}
	
}
public class MethodExample2 {
	public static void main(String[] args) {
		Box<String> strBox = new Box<>();
		strBox.set("Hello");
		 System.out.println("Value: " + strBox.get());
	}
	
	

}
