package javaoop;

public class ToyShop {
	public static void main(String[] args) {
		ShopKeeper suzuki = new ShopKeeper("鈴木");
		CarToy car1 = new CarToy("c001", 500);
		CarToy car2 = new CarToy("c002", 500);
		TrainToy train1 = new TrainToy("t001", 700);

		// suzuki.name_ = "鈴木";
		// car1.code_ = "c001";
		// car1.price_ = 500;
		// car2.code_ = "c002";
		// car2.price_ = 500;
		// train1.code_ = "t001";
		// train1.price_ = 700;

		// System.out.println(suzuki.name_);
		// System.out.println(car1.code_);
		// System.out.println(car1.price_);
		// System.out.println(car2.code_);
		// System.out.println(car2.price_);
		// System.out.println(train1.code_);
		// System.out.println(train1.price_);

		// car1.go();
		// car1.light();
		// car2.go();
		// car2.light();
		// train1.go();
		// train1.horn();

		//! Textbook p.139
		suzuki.checkPrice(car1, car2, train1);
		suzuki.doDemo(car1, car2, train1);
	}
}