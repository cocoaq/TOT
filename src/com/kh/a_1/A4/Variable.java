package com.kh.a_1.A4;

public class Variable {

	public static void main(String[] args) {
		boolean bv = true;
		byte bnum = 10;
		short snum = 20;
		int inum = 30;
		long lnum = 40l;
		float fnum = 50.0f;
		double dnum = 60.0;
		char ch = 'a';
		String str = "Hello";
		int result = 0;
		
		
		System.out.println("bv = " + bv);
		System.out.println("byte bnum = " + bnum);
		System.out.println("short snum = " + snum);
		System.out.println("int inum = " + inum);
		System.out.println("long lnum = " + lnum);
		System.out.println("float fnum = " + fnum);
		System.out.println("double dnum = " + dnum);
		System.out.println("char ch = " + ch);
		System.out.println("String str = " + str);
		
		result = bnum + snum;
		System.out.println("bnum + snum = result : " + result);
	}

}
