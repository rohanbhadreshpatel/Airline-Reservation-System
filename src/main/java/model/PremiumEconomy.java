package model;
import type.Category;

public class PremiumEconomy implements Category {
	private String name;
	private int price, counter;
	
	PremiumEconomy(){
		name = "PREMIUM ECONOMY";
	}
	
	public String getName() {
		return name;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public int getSeatCount() {
		return counter;
	}
	
	public void setSeatCount(int seatCount) {
		this.counter = seatCount;
	}
	
	public int computePrice() {
		return price * counter;
	}
	
}

