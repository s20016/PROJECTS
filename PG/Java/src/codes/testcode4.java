package codes;

public class testcode4 {

	public static void main(String[] args) {
		class A {						
			public A() {					
				System.out.println("constructor");				
			}					
			public void hello() {					
				System.out.println("hello");				
			}					
		}						
		A a = new A();						
		a.hello();
	}

}
