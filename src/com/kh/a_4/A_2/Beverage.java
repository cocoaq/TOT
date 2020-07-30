package com.kh.a_4.A_2;

public class Beverage {

	private String beverage;
	private int price;
	private char hotOrIce;
	
	public Beverage() {}
	
	public Beverage(String beverage, int price, char hotOrIce) {
		super();
		this.beverage = beverage;
		this.price = price;
		this.hotOrIce = hotOrIce;
	}
	public String getBeverage() {
		return beverage;
	}
	public void setBeverage(String beverage) {
		this.beverage = beverage;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public char getHotOrIce() {
		return hotOrIce;
	}
	public void setHotOrIce(char hotOrIce) {
		this.hotOrIce = hotOrIce;
	}
	
	
	
}
