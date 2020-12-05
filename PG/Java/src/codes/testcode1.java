package codes;

public class testcode1 {

	public static void main(String[] args) {
		testcode1 x = new testcode1();
		System.out.println(x.minCat("Hello", "Hi"));
		System.out.println(x.minCat("Hello", "java"));
		System.out.println(x.minCat("java", "Hello"));
		
//		minCat("Hello", "Hi") → "loHi"
//		minCat("Hello", "java") → "ellojava"
//		minCat("java", "Hello") → "javaello"
    }

	public String minCat(String a, String b) {
		return (a.length() > b.length()) ? a.substring(a.length() - b.length()) + b : a + b.substring(b.length() - a.length());
	}
}