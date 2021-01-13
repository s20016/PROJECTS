package codes;

public class testcode2 {
	
	public static void main(String[] args) {
		class LedLight {
			private int status = 0;
			public void lightUp() {
				if (status == 0) {
					status = 1;
					System.out.println("Lights on!");
				}
			}
			public void lightDown() {
				if (status == 1) {
					status = 0;
					System.out.println("Lights off!");
				}
			}
		}
		
		class Robot {
			private String name;
			private LedLight light;
			public void sayHello() {
				light.lightUp();
				System.out.println("Hi I'm " + name);
				light.lightDown();
			}
			public void setLight(LedLight light) {
				this.light = light;
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
		robot.setLight(new LedLight());
		robot.sayHello();
	}		
}