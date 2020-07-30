package com.kh.a_4.A_3;

public class ObjectConstructor {

	int num1;
	double num2;
	char ch;
	
	public ObjectConstructor() {}
	

	public ObjectConstructor(int num1, double num2, char ch) {
		super();
		this.num1 = num1;
		this.num2 = num2;
		this.ch = ch;
	}
	public ObjectConstructor(ObjectConstructor object) {
		super();
		this.num1 = object.num1;
		this.num2 = object.num2;
		this.ch = object.ch;
	}
	
	@Override
	public String toString() {
		return "ObjectConstructor [num1=" + num1 + ", num2=" + num2 + ", ch=" + ch + "]";
	}

}
