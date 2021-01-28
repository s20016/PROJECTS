package codes;

public class testcode4 extends testcode5 {
	@Override
	public void sample() {
		System.out.println("sample()");
	}
	
	@Override
	void test() {
		System.out.println("test()");
	}
	
	
	public static void main(String[] args) {
		test();
	}
}
