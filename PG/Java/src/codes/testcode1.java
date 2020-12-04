package codes;

public class testcode1 {

	public static void main(String[] args) {
		testcode1 x = new testcode1();
		System.out.println(x.everyNth("Miracle", 2));
//		everyNth("Miracle", 2) → "Mrce"
    }

	public String everyNth(String str, int n) {
		  String ret = "";
		  for (int i = 0; i < str.length(); i += n) {
			  ret += str.substring(i, i + 1);
		  }
		  return ret;
		}

}
