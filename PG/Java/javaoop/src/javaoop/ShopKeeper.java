package javaoop;

public class ShopKeeper {
	String name_;		//名前

	//! Textbook p.134-143
	//コンストラクタ
	public ShopKeeper(String name) {
		name_ = name;
	}
	
	//価格をチェックする
	public void checkPrice(CarToy kuruma1, CarToy kuruma2, TrainToy densya1) {
		System.out.println("\n");
		System.out.println("私は" + name_ + "。いまからチェックします。");
		System.out.println("コード" + kuruma1.code_ + "の値段は円" + kuruma1.price_);
		System.out.println("コード" + kuruma2.code_ + "の値段は円" + kuruma2.price_);
		System.out.println("コード" + densya1.code_ + "の値段は円" + densya1.price_);
		System.out.println("\n");
	}
	
	//デモする
	public void doDemo(CarToy kuruma1, CarToy kuruma2, TrainToy densya1) {
		System.out.println("私は" + name_ + "。いまからデモします。");
		System.out.println("Accelerating Car1");
		kuruma1.go();
		System.out.println("Accelerating Car2");
		kuruma2.go();
		System.out.println("Accelerating Train1");
		densya1.go();
		System.out.println("\n");
	}
}