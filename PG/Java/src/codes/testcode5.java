package codes;

public class testcode5 {
	
    public interface Car {
        void drive();
        void stop();
        void turn();
    }
    
    public class CarA implements Car {
        @Override
        public void drive() {
            System.out.println("CarA Runs!");
        }
        @Override
        public void stop() {
            System.out.println("CarA Stops!");
        }
        @Override
        public void turn() {
            System.out.println("CarA Turns!");
        }
    }
    
    public class CarFactory {
    	public static Car create() {
    		return new CarA();
    	}
    }
    
	public static void main(String[] args) {
		Car car = CarFactory.create();
		Car a = new Car();
		a.drive();
		a.stop();
		a.turn();
	}
}
