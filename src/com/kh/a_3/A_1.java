package com.kh.a_3;

public class A_1 {

	public void test1() {
		String arr1[] = new String[4]; 

		for(int i = 0; i < arr1.length ; i++) {
			if(i == 0) {
				arr1[i] = "바나나";
				System.out.println(arr1[i] + " 원숭이");
			}else if(i == 1) {
				arr1[i] = "복숭아";
				System.out.println(arr1[i] + " 악어");
			}else if(i == 2) {
				arr1[i] = "자두";
				System.out.println(arr1[i] + " 고릴라");
			}else if(i == 3) {
				arr1[i] = "수박";
				System.out.println(arr1[i] + " 오징어");
			}
		}

	}


	public void test2() {
		char arr2[][] = new char[5][5];
		
		for(int i = 0; i < arr2.length;i++) {
			for(int j = 0; j <= i;j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
	}

	public static void main(String[] args) {
		A_1 a = new A_1();
		
		a.test1();
		a.test2();
	}

}
