package com.kh.a_1.A4;

import java.util.Scanner;

public class Operator {

	public static void main(String[] args) {
		String name;
		boolean gender;
		int esco;
		double msco;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 : ");
		name = sc.nextLine();
		System.out.print("남자인가?(true/false)");
		gender = sc.nextBoolean();
		System.out.print("영어 성적(정수) : ");
		esco = sc.nextInt();
		System.out.print("수학 성적(실수) : ");
		msco = sc.nextDouble();
		
		System.out.println("이름 : " + name + ( 
				(gender == true)?" 영어 점수 : " + esco : " 수학 점수 : " + msco));
	}

}
