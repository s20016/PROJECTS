package codes;

public class testcode2 {
	
	public static void main(String[] args) {
		class SuperClass {
			public void hello() {
				System.out.println("Hello");
			}
		}
		
		class SubClass extends SuperClass {
			
		}
		
		SubClass sub = new SubClass();
		sub.hello();
	}		
}