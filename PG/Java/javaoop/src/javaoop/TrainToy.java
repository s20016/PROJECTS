package javaoop;

public class TrainToy {
	String	code_;		//商品コード
	int		price_;		//価格

	//コンストラクタ
	public TrainToy(String code, int price) {
		code_ = code;
		price_ = price;
	}

	//走る
	public void go(){
		System.out.println("ガタンゴトン");
	}
	
	//警笛を鳴らす
	public void horn(){
		System.out.println("プォー！");
	}
}
