package codes;

public class testcode4<T> {
	
	T ret;
	
	testcode4(T ret) {
		this.ret = ret;
	}
	
	void getValue() {
		System.out.println(ret.getClass().getName());
	}
}