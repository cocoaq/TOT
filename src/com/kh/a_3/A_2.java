package com.kh.a_3;

import java.util.Scanner;

public class A_2 {
	public void test1() {
		
		int arr1[] = new int[10];
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 10개를 입력하세요 : ");
		for(int i = 0; i < arr1.length; i++) {
			arr1[i] = sc.nextInt();
		}
		
		System.out.println("입력받은 정수의 3의 배수는  : ");
		for(int j = 0; j < arr1.length;j++) {
			if((arr1[j] % 3) == 0) {
				System.out.println(arr1[j]);
			}
		}
	}
	public void test2() {
		int arr2[][] = new int [3][3];
		int num = 0;
		
		for(int i = 0; i < arr2.length; i++) {
			for(int j = 0; j < arr2[i].length; j++) {
				num++;
				arr2[i][j] = num;
				
				System.out.print(arr2[i][j]);
			}
			System.out.println("");
		}
	}
	

	public static void main(String[] args) {
		A_2 a = new A_2();
//		a.test1();
		a.test2();
	}

}
