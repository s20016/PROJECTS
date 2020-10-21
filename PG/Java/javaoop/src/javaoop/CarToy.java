package javaoop;

public class CarToy {
    String	code_;		//商品コード
	int		price_;		//価格

	//コンストラクタ
	public CarToy(String code, int price) {
		this.code_ = code;
		this.price_ = price;
	}

	//走る
	public void go() {
		System.out.println("ブロローッ");
	}

	//ライトを点ける
	public void light() {
		System.out.println("ピカーッ");
	}
}
