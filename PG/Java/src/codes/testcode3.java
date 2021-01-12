package codes;

public class testcode3 {

	public static void main(String[] args) {
		
		class Robot {
			private String name;
			
			public void sayHello() {
				System.out.println();
			}

			public String getName() {
				return name;
			}
			
			public void setName(String name) {
				this.name = name;
			}
		}
		
		Robot robot = new Robot();
		robot.setName("Java Robot");
		robot.sayHello();
	}							
}