package classTest5;

public class Mask {
	String color;
	int price;
	int value;
	
	public Mask(String color, int price, int value) {
		this.color = color;
		this.price = price;
		this.value = value;
	}
	@Override
	public String toString() {
		return "Mask [color=" + color + ", price=" + price + ", value=" + value + "]";
	}
	
}
