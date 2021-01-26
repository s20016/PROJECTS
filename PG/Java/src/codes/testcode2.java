package codes;

public class testcode2 {
	
	public static void main(String[] args) {
		// Superclass
		class TaxCalculator {
			protected int price;
			public void setPrice(int price) {
				this.price = price;
			}
			public int getResult() {
				return 0;
			}
		}
		// Subclass
		class ExciseTax extends TaxCalculator {
			@Override
			public int getResult() {
				int result = (int)(super.price * 1.10);
				return result;
			}
		}
		
		class Calculator {
			private TaxCalculator taxCal;
			private int price;
			private int qty;
			public void setTaxCal(TaxCalculator taxCal) {
				this.taxCal = taxCal;
			}
			public void setPrice(int price) {
				this.price = price;
			}
			public void setQty(int qty) {
				this.qty = qty;
			}
			public int getResult() {
				if (this.taxCal != null) {
					taxCal.setPrice(price * qty);
					return taxCal.getResult();
				}
				return price * qty;
			}
		}
		
		Calculator calc = new Calculator();
		calc.setPrice(1000);
		calc.setQty(3);
		calc.setTaxCal(new ExciseTax());
		int result = calc.getResult();
		System.out.println(result);
	}
}
