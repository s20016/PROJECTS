package codes;

public class testcode1 {

	public static void main(String[] args) {
		testcode1 x = new testcode1();
//		int[] arr = {1, 1, 2, 3, 1};
		System.out.println(x.stringX("xxHxix"));
		System.out.println(x.stringX("xabxxxcdx"));
	
//		stringX("xxHxix") → "xHix"
//		stringX("abxxxcd") → "abcd"
//		stringX("xabxxxcdx") → "xabcdx"
    }

	public String stringX(String str) {
		String ret = "";
		for (int i = 0; i < str.length(); i++) {
			if (!(0 < i && i < str.length() - 1 && str.substring(i, i + 1).equals("x"))) {
				ret += str.substring(i, i + 1);
			}
		}
		return ret;
	}
}
