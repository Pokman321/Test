package sugar.enumtype;

public class FruitTest {
	public static void main(String[] args) {
		Fruit a1 = Fruit.APPLE;

//		Fruit a3 = Fruit.APPLE(3);

		System.out.println("Price is " + a1.getPrice());
	}
}

enum Fruit
{
	APPLE(10), ORANGE(8);
	private int price;
	
	Fruit(int price) {
		this.price = price;
	}
	
	public int getPrice() {
		return this.price;
	}
}

