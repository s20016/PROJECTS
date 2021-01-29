package codes;

class Naruto {
    int chakra;
    private int health = 100;  // Adding private variable

    // Getter Method
	public void getHealth() {
		System.out.println(health);
	}
	
    // Setter Method
	public void setHealth(int x) {
//		health = 100 - x;
		health = x;
	}

}