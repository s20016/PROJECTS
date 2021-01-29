package codes;

class Sakura {

 // Sakura focuses on Naruto
	Naruto naruto = new Naruto();
	
	public void Attack(int damage) {
		System.out.println("しゃんなろー!!");

     // Accessing variables through Getter and Setter
		int attack = naruto.setHealth(damage);
		naruto.getHealth();
	}
}