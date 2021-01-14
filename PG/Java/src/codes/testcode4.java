package codes;

public class testcode4 {

	public static void main(String[] args) {
		class sample {
			public static void hello() {
				// do something
			}
		}
		sample[] samples = new sample[3];
		
		for (sample sample : samples) {
			System.out.println(sample);
		}
	}

}
