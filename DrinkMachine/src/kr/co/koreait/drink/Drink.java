package kr.co.koreait.drink;

public class Drink {
	private String name;
	private int price;
	private int index;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return String.format("%s - %,d원", getName(), getPrice());
	}

}
