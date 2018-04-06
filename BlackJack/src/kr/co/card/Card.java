package kr.co.card;

public class Card {
	private String shape;
	private String number;
	public String getShape() {
		return shape;
	}
	public void setShape(String shape) {
		this.shape = shape;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	
	@Override
	public String toString() {
		return String.format("%s - %s", this.shape, this.number);
	}

	
}
