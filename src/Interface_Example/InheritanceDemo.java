package Interface_Example;


class Base {
	void BaseClass() {
		System.out.println("This is base Class Function ");
	}
}

class SubClass extends Base {
	void SubClass() {
		System.out.println("This is Subclass Function ");
	}
}
public class InheritanceDemo {
	
	public static void main(String[] args) {
		
		SubClass sub1 = new SubClass();
		sub1.BaseClass();
		sub1.SubClass();
		
	}

}
