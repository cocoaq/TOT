package com.kh.a_5.A_1;

public class Animal {

	private String name;
	private String jong;
	private int age;
	private String bun;
	private String place;
	
	public Animal() {}
	
	public Animal(String name, String jong, int age, String bun, String place) {
		super();
		this.name = name;
		this.jong = jong;
		this.age = age;
		this.bun = bun;
		this.place = place;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getJong() {
		return jong;
	}

	public void setJong(String jong) {
		this.jong = jong;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getBun() {
		return bun;
	}

	public void setBun(String bun) {
		this.bun = bun;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}
	
	public String getInfomation() {
		return "이름 : " + name + " 종류 : " + jong + " 나이 : " + age + "살 번식 : " + bun + " 서식지 : " + place;
	}
	
}
