package com.kh.a_4.A_2;

public class Main {

	public static void main(String[] args) {
		Beverage[] ber = new Beverage[4];
		
		ber[0] = new Beverage("아메리카노", 4500, 'H');
		ber[1] = new Beverage("라떼", 5000, 'H');
		ber[2] = new Beverage("모카", 5500, 'I');
		ber[3] = new Beverage("에이드", 6000, 'I');
		
		Beverage b = new Beverage();
		for(int i = 0; i < ber.length ; i++) {
			
			System.out.println(ber[i].getPrice());
		}
		
	}

}
