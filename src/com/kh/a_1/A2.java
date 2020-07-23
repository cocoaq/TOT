package com.kh.a_1;

import java.util.Scanner;

public class A2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double num1 = 0;
		double num2 = 0;
		double num3 = 0;
		double num4 = 0;

		int avg = 0;

		System.out.print("국어 : ");
		num1 = sc.nextDouble();
		System.out.print("영어 : ");
		num2 = sc.nextDouble();
		System.out.print("수학 : ");
		num3 = sc.nextDouble();
		System.out.print("과학 : ");
		num4 = sc.nextDouble();

		avg = (int)((num1+num2+num3+num4)/4);

		System.out.println("평균 : " + avg);


	}

}
